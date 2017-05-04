package com.animate.until;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * Created by Administrator on 2016/12/7.
 */
public class FindStatementUntil<T> {

    /**
     * avg,count,max,min,sum,
     * distinct
     */
    private Set<KeyValue> selectSet = new HashSet<KeyValue>();
    private Set<KeyValue> fromSet = new HashSet<KeyValue>();
    private Set<KeyValue> whereSet = new HashSet<KeyValue>();
    private Set<KeyValue> groupBySet = new HashSet<KeyValue>();
    private Set<KeyValue> haveSet = new HashSet<KeyValue>();
    private Set<KeyValue> orderBySet = new HashSet<KeyValue>();
    private Map<String, Integer> limitMap = new HashMap<String, Integer>();
    /**
     * (),and,or,not
     * */
    private Set<KeyValue> logicSet;
    /**
     * in,not in,
     * like,not like,
     * exist,not exist,
     * lt,le,gt,ge,eq,not eq,
     * between,not between,
     * null,not null,
     */
    private Set<KeyValue> calSet;

    private StringBuilder selectStatement;
    private StringBuilder fromStatement;
    private StringBuilder whereStatement;
    private StringBuilder groupByStatement;
    private StringBuilder haveStatement;
    private StringBuilder orderByStatement;
    private StringBuilder limitStatement;

    private final String PERFIX_SELECT = " SELECT ";
    private final String PERFIX_FROM = " FROM ";
    private final String PERFIX_WHERE = " WHERE ";
    private final String PERFIX_GROUPBY = " GROUP BY ";
    private final String PERFIX_HAVING = " HAVING ";
    private final String PERFIX_ORDERBY = " ORDER BY ";
    private final String PERFIX_LIMIT = " LIMIT ";
    private final String PERFIX_CONDITION = " 1 = 1 ";
    private final String PERFIX_AS = " AS ";

    public static final int AGGREGATE_AVG = 1;
    public static final String AGGREGATE_SQL_AVG = "AVG";
    public static final int AGGREGATE_COUNT = 2;
    public static final String AGGREGATE_SQL_COUNT = "COUNT";
    public static final int AGGREGATE_MAX = 3;
    public static final String AGGREGATE_SQL_MAX = "MAX";
    public static final int AGGREGATE_MIN = 4;
    public static final String AGGREGATE_SQL_MIN = "MIN";
    public static final int AGGREGATE_SUM = 5;
    public static final String AGGREGATE_SQL_SUM = "SUM";

    public static final int FILTER_NORMAL = 6;
    public static final String FILTER_SQL_NORMAL = "";
    public static final int FILTER_DISTINCT = 7;
    public static final String FILTER_SQL_DISTINCT = "DISTINCT";
    public static final int FILTER_CASE = 8;
    public static final String FILTER_SQL_CASE_FRONT = "CASE";
    public static final String FILTER_SQL_CASE_MIDDLE = "WHEN";
    public static final String FILTER_SQL_CASE_AFTER = "THEN";
    public static final String FILTER_SQL_CASE_OTHER = "ELSE";
    public static final String FILTER_SQL_CASE_FINAL = "END";

    public static final int RELATION_LEFT_JOIN = 1;
    public static final String RELATION_SQL_LEFT_JOIN = "LEFT JOIN";
    public static final int RELATION_RIGHT_JOIN = 2;
    public static final String RELATION_SQL_RIGHT_JOIN = "RIGHT_JOIN";
    public static final int RELATION_INNER_JOIN = 3;
    public static final String RELATION_SQL_INNER_JOIN = "INNER_JOIN";
    public static final int RELATION_FULL_JOIN = 4;
    public static final String RELATION_SQL_FULL_JOIN = "FULL_JOIN";
    public static final int RELATION_JOIN = 5;
    public static final String RELATION_SQL_JOIN = "JOIN";
    public static final int RELATION_CROSS_JOIN = 6;
    public static final String RELATION_SQL_CROSS_JOIN = "CROSS JOIN";
    public static final String RELATION_SQL_COMMON = "ON";

    public static final int LOGIC_AND = 1;
    public static final String LOGIC_SQL_AND = "AND";
    public static final int LOGIC_OR = 2;
    public static final String LOGIC_SQL_OR = "OR";
    public static final int LOGIC_LEFT_BRACKET = 3;
    public static final String LOGIC_SQL_LEFT_BRACKET = "(";
    public static final int LOGIC_RIGHT_BRACKET = 4;
    public static final String LOGIC_SQL_RIGHT_BRACKET = ")";

    public static final int CAL_IN = 1;
    public static final String CAL_SQL_IN = "IN";
    public static final int CAL_NOT_IN = 2;
    public static final String CAL_SQL_NOT_IN = "NOT IN";
    public static final int CAL_EXIST = 3;
    public static final String CAL_SQL_EXIST = "EXIST";
    public static final int CAL_NOT_EXIST = 4;
    public static final String CAL_SQL_NOT_EXIST = "NOT EXIST";
    public static final int CAL_NULL = 5;
    public static final String CAL_SQL_NULL = "IS NULL";
    public static final int CAL_NOT_NULL = 6;
    public static final String CAL_SQL_NOT_NULL = "IS NOT NULL";
    public static final int CAL_LIKE = 7;
    public static final String CAL_SQL_LIKE = "LIKE";
    public static final int CAL_NOT_LIKE = 8;
    public static final String CAL_SQL_NOT_LIKE = "NOT LIKE";
    public static final int CAL_LT = 9;
    public static final String CAL_SQL_LT = "<";
    public static final int CAL_LE = 10;
    public static final String CAL_SQL_LE = "<=";
    public static final int CAL_GT = 11;
    public static final String CAL_SQL_GT = ">";
    public static final int CAL_GE = 12;
    public static final String CAL_SQL_GE = ">=";
    public static final int CAL_EQ = 13;
    public static final String CAL_SQL_EQ = "=";
    public static final int CAL_NOT_EQ = 14;
    public static final String CAL_SQL_NOT_EQ = "<>";
    public static final int CAL_BETWEEN = 15;
    public static final String CAL_SQL_BETWEEN_FRONT = "BETWEEN";
    public static final String CAL_SQL_BETWEEN_AFTER = "AND";
    public static final int CAL_NOT_BETWEEN = 16;
    public static final String CAL_SQL_NOT_BETWEEN_FRONT = "NOT BETWEEN";
    public static final String CAL_SQL_NOT_BETWEEN_AFTER = "AND";

    private static final int HAVING_AVG_LIKE = 1;
    public static final int HAVING_AVG_NOT_LIKE = 2;
    public static final int HAVING_AVG_EQ = 3;
    public static final int HAVING_AVG_NOT_EQ = 4;
    public static final int HAVING_AVG_LT = 5;
    public static final int HAVING_AVG_LE = 6;
    public static final int HAVING_AVG_GT = 7;
    public static final int HAVING_AVG_GE = 8;
    public static final int HAVING_COUNT_LIKE = 9;
    public static final int HAVING_COUNT_NOT_LIKE = 10;
    public static final int HAVING_COUNT_EQ = 11;
    public static final int HAVING_COUNT_NOT_EQ = 12;
    public static final int HAVING_COUNT_LT = 13;
    public static final int HAVING_COUNT_LE = 14;
    public static final int HAVING_COUNT_GT = 15;
    public static final int HAVING_COUNT_GE = 16;
    public static final int HAVING_MAX_LIKE = 17;
    public static final int HAVING_MAX_NOT_LIKE = 18;
    public static final int HAVING_MAX_EQ = 19;
    public static final int HAVING_MAX_NOT_EQ = 20;
    public static final int HAVING_MAX_LT = 21;
    public static final int HAVING_MAX_LE = 22;
    public static final int HAVING_MAX_GT = 23;
    public static final int HAVING_MAX_GE = 24;
    public static final int HAVING_MIN_LIKE = 25;
    public static final int HAVING_MIN_NOT_LIKE = 26;
    public static final int HAVING_MIN_EQ = 27;
    public static final int HAVING_MIN_NOT_EQ = 28;
    public static final int HAVING_MIN_LT = 29;
    public static final int HAVING_MIN_LE = 30;
    public static final int HAVING_MIN_GT = 31;
    public static final int HAVING_MIN_GE = 32;
    public static final int HAVING_SUM_LIKE = 33;
    public static final int HAVING_SUM_NOT_LIKE = 34;
    public static final int HAVING_SUM_EQ = 35;
    public static final int HAVING_SUM_NOT_EQ = 36;
    public static final int HAVING_SUM_LT = 37;
    public static final int HAVING_SUM_LE = 38;
    public static final int HAVING_SUM_GT = 39;
    public static final int HAVING_SUM_GE = 40;

    public static final int HAVING_AVG = 95;
    public static final int HAVING_COUNT = 96;
    public static final int HAVING_MAX = 97;
    public static final int HAVING_MIN = 98;
    public static final int HAVING_SUM = 99;
    public static final String HAVING_SQL_AVG = "AVG";
    public static final String HAVING_SQL_COUNT = "COUNT";
    public static final String HAVING_SQL_MAX = "MAX";
    public static final String HAVING_SQL_MIN = "MIN";
    public static final String HAVING_SQL_SUM = "SUM";

    public static final int ORDER_BY_ASC = 1;
    public static final String ORDER_BY_SQL_ASC = "ASC";
    public static final int ORDER_BY_DESC = 2;
    public static final String ORDER_BY_SQL_DESC = "DESC";

    public static final String LIMIT_SQL = " LIMIT ";

    private Class<T> entityClass;
    private String className;
    private Logger logger;

    public FindStatementUntil() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.className = this.entityClass.getName();
        this.logger = Logger.getLogger(this.entityClass);
    }

    private boolean isExistProperties(Class clazz, String properties) {
        String[] proper = properties.split("\\.", 2);
        if(proper.length == 0) {
            return false;
        }
        Field[] fields = this.entityClass.getDeclaredFields();
        for(Field field : fields) {
            field.setAccessible(true);
            if(field.getName().equals(proper[0])) {
                if(proper.length == 2) {
                    this.isExistProperties(field.getType(), proper[1]);
                }
                return true;
            }
        }
        return false;
    }

    //Select------------------------------------------------------------//
    public void avg(String properties) {
        this.addSelect(properties, null, AGGREGATE_AVG);
    }

    public void avg(String properties, String secondName) {
        this.addSelect(properties, secondName, AGGREGATE_AVG);
    }

    public void count(String properties) {
        this.addSelect(properties, null, AGGREGATE_COUNT);
    }

    public void count(String properties, String secondName) {
        this.addSelect(properties, secondName, AGGREGATE_COUNT);
    }

    public void max(String properties) {
        this.addSelect(properties, null, AGGREGATE_MAX);
    }

    public void max(String properties, String secondName) {
        this.addSelect(properties, secondName, AGGREGATE_MAX);
    }

    public void min(String properties) {
        this.addSelect(properties, null, AGGREGATE_MIN);
    }

    public void min(String properties, String secondName) {
        this.addSelect(properties, secondName, AGGREGATE_MIN);
    }

    public void sum(String properties) {
        this.addSelect(properties, null, AGGREGATE_SUM);
    }

    public void sum(String properties, String secondName) {
        this.addSelect(properties, secondName, AGGREGATE_SUM);
    }

    public void normal(String properties, String secondName) {
        this.addSelect(properties, secondName, FILTER_DISTINCT);
}

    public void distinct() {
        this.addSelect(null, null, FILTER_NORMAL);
    }

    public void caseWhen(String properties, Map<String, String> map) {
        StringBuilder value = new StringBuilder();
        for(Map.Entry<String, String> entry : map.entrySet()) {
            value.append(entry.getKey() + ":" + entry.getValue() + ";");
        }
        this.addSelect(properties, value.toString(), FILTER_CASE);
    }

    public void caseWhen(String properties, String[] when, String[] then) {
        StringBuilder value = new StringBuilder();
        for(int index = 0, length = when.length; index < length; index ++) {
            value.append(when + ":" + then + ";");
        }
        this.addSelect(properties, value.toString(), FILTER_CASE);
    }

    private void addSelect(String properties, String secondName, int operation) {
        if(this.isExistProperties(this.entityClass, properties)) {
            switch (operation) {
                case AGGREGATE_AVG:
                    this.selectSet.add(new KeyValue(properties, secondName, AGGREGATE_SQL_AVG));
                    break;
                case AGGREGATE_COUNT:
                    this.selectSet.add(new KeyValue(properties, secondName, AGGREGATE_SQL_COUNT));
                    break;
                case AGGREGATE_MAX:
                    this.selectSet.add(new KeyValue(properties, secondName, AGGREGATE_SQL_MAX));
                    break;
                case AGGREGATE_MIN:
                    this.selectSet.add(new KeyValue(properties, secondName, AGGREGATE_SQL_MIN));
                    break;
                case AGGREGATE_SUM:
                    this.selectSet.add(new KeyValue(properties, secondName, AGGREGATE_SQL_SUM));
                    break;
                case FILTER_NORMAL:
                    this.selectSet.add(new KeyValue(properties, secondName, FILTER_SQL_NORMAL));
                    break;
                case FILTER_DISTINCT:
                    this.selectSet.add(new KeyValue(null, null, FILTER_SQL_DISTINCT));
                    break;
                case FILTER_CASE:
                    this.selectSet.add(new KeyValue(properties, secondName, FILTER_SQL_DISTINCT));
                    break;
                default:
                    //TODO Exception
                    break;
            }
        }
    }

    private void packageSelect() {
        if(this.selectSet.size() > 0) {
            if(this.selectSet.contains(new KeyValue(null, null, FILTER_SQL_DISTINCT))) {
                this.selectStatement = new StringBuilder(PERFIX_SELECT + FILTER_SQL_DISTINCT);
            } else {
                this.selectStatement = new StringBuilder(PERFIX_SELECT);
            }
            int length = this.selectSet.size();
            int index = 1;
            for(KeyValue obj: this.selectSet) {
                int operation = (Integer) obj.getBackupValue();
                switch (operation) {
                    case AGGREGATE_AVG:
                        this.selectStatement.append(AGGREGATE_SQL_AVG + "(" + obj.getKey() + ")");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case AGGREGATE_COUNT:
                        this.selectStatement.append(AGGREGATE_SQL_COUNT + "(" + obj.getKey() + ")");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case AGGREGATE_MAX:
                        this.selectStatement.append(AGGREGATE_SQL_MAX + "(" + obj.getKey() + ")");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case AGGREGATE_MIN:
                        this.selectStatement.append(AGGREGATE_SQL_MIN + "(" + obj.getKey() + ")");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case AGGREGATE_SUM:
                        this.selectStatement.append(AGGREGATE_SQL_SUM + "(" + obj.getKey() + ")");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case FILTER_NORMAL:
                        this.selectStatement.append(" " + obj.getKey() + " ");
                        this.isExistSecondName(obj, index++, length);
                        break;
                    case FILTER_DISTINCT:
                        break;
                    case FILTER_CASE:
                        if(obj.getKey() != null) {
                            this.selectStatement.append(" " + FILTER_SQL_CASE_FRONT + " " + obj.getKey() + " ");
                        } else {
                            this.selectStatement.append(" " + FILTER_SQL_CASE_FRONT + " " );
                        }
                        String[] splits = ((String)obj.getValue()).split(";");
                        for(String split : splits) {
                            String[] str = split.split(":");
                            if(!str[0].equals("null")) {
                                this.selectStatement.append(" " + FILTER_SQL_CASE_MIDDLE + " " + str[0] + " " + FILTER_SQL_CASE_AFTER + " " + str[1]);
                            } else {
                                this.selectStatement.append(" " + FILTER_SQL_CASE_OTHER + " " + str[1]);
                            }
                        }
                        this.selectStatement.append(" " + FILTER_SQL_CASE_FINAL+ " ");
                        break;
                    default:
                        //TODO Exception
                        break;
                }
            }
        } else {
            this.selectStatement = new StringBuilder("");
        }
    }

    private void isExistSecondName(KeyValue obj, int index, int length) {
        if(obj.getValue() != null && !"".equals(obj.getValue())) {
            this.selectStatement.append(PERFIX_AS + obj.getValue());
        }
        if(index < length) {
            this.selectStatement.append(",");
        }
    }

    //From------------------------------------------------------------//
    public void crossJoin(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_CROSS_JOIN);
    }

    public void crossJoin(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_CROSS_JOIN);
    }

    public void join(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_JOIN);
    }

    public void join(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_JOIN);
    }

    public void fullJoin(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_FULL_JOIN);
    }

    public void fullJoin(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_FULL_JOIN);
    }

    public void innerJoin(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_INNER_JOIN);
    }

    public void innerJoin(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_INNER_JOIN);
    }

    public void leftJoin(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_LEFT_JOIN);
    }

    public void leftJoin(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_LEFT_JOIN);
    }

    public void rightJoin(String properties, String condition) {
        this.addFrom(properties, null, condition, RELATION_RIGHT_JOIN);
    }

    public void rightJoin(String properties, String secondName, String condition) {
        this.addFrom(properties, secondName, condition, RELATION_RIGHT_JOIN);
    }

    private void addFrom(String properties, String secondName, String condition, int operation) {
        if(this.isExistProperties(this.entityClass, properties)) {
            switch (operation) {
                case RELATION_CROSS_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_CROSS_JOIN + ":" + condition));
                    break;
                case RELATION_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_JOIN + ":" + condition));
                    break;
                case RELATION_FULL_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_FULL_JOIN + ":" + condition));
                    break;
                case RELATION_INNER_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_INNER_JOIN + ":" + condition));
                    break;
                case RELATION_LEFT_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_LEFT_JOIN + ":" + condition));
                    break;
                case RELATION_RIGHT_JOIN:
                    this.fromSet.add(new KeyValue(properties, secondName, RELATION_SQL_RIGHT_JOIN + ":" + condition));
                    break;
                default:
                    //TODO Exception
                    break;
            }
        } else {
            //TODO Exception
        }
    }

    private void packageFrom() {
        //TODO
        this.fromStatement = new StringBuilder(PERFIX_FROM + this.className + PERFIX_AS + "entity ");
        for(KeyValue obj : this.selectSet) {

        }
    }

    //Where------------------------------------------------------------//
    public void like(String properties, String value) {
        this.addWhere(properties, value, CAL_LIKE);
    }

    public void notLike(String properties, String value) {
        this.addWhere(properties, value, CAL_NOT_LIKE);
    }

    public void in(String properties, String value) {
        this.addWhere(properties, this.dealInOrNotIn(value), CAL_IN);
    }

    public void notIn(String properties, String value) {
        this.addWhere(properties, this.dealInOrNotIn(value), CAL_NOT_IN);
    }

    public void exist(String properties, String value) {
        this.addWhere(properties, value, CAL_EXIST);
    }

    public void notExist(String properties, String value) {
        this.addWhere(properties, value, CAL_NOT_EXIST);
    }

    public void isNull(String properties, String value) {
        this.addWhere(properties, value, CAL_NULL);
    }

    public void isNotNull(String properties, String value) {
        this.addWhere(properties, value, CAL_NOT_NULL);
    }

    public void eq(String properties, String value) {
        this.addWhere(properties, value, CAL_EQ);
    }

    public void notEQ(String properties, String value) {
        this.addWhere(properties, value, CAL_NOT_EQ);
    }

    public void le(String properties, String value) {
        this.addWhere(properties, value, CAL_LE);
    }

    public void lt(String properties, String value) {
        this.addWhere(properties, value, CAL_LT);
    }

    public void ge(String properties, String value) {
        this.addWhere(properties, value, CAL_GE);
    }

    public void gt(String properties, String value) {
        this.addWhere(properties, value, CAL_GT);
    }

    public void between(String properties, String min, String max) {
        this.addWhere(properties, min + ";" + max, CAL_BETWEEN);
    }

    public void notBetween(String properties, String min, String max) {
        this.addWhere(properties, min + ";" + max, CAL_NOT_BETWEEN);
    }

    private void addWhere(String properties, String value, int operation) {
        if(this.isExistProperties(this.entityClass, properties)) {
            switch (operation) {
                case CAL_LIKE:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_LIKE));
                    break;
                case CAL_NOT_LIKE:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_LIKE));
                    break;
                case CAL_IN:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_IN));
                    break;
                case CAL_NOT_IN:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_IN));
                    break;
                case CAL_EXIST:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_EXIST));
                    break;
                case CAL_NOT_EXIST:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_EXIST));
                    break;
                case CAL_NULL:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NULL));
                    break;
                case CAL_NOT_NULL:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_NULL));
                    break;
                case CAL_EQ:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_EQ));
                    break;
                case CAL_NOT_EQ:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_EQ));
                    break;
                case CAL_LE:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_LE));
                    break;
                case CAL_LT:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_LT));
                    break;
                case CAL_GE:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_GE));
                    break;
                case CAL_GT:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_GT));
                    break;
                case CAL_BETWEEN:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_BETWEEN_FRONT));
                    break;
                case CAL_NOT_BETWEEN:
                    this.whereSet.add(new KeyValue(properties, value, CAL_SQL_NOT_BETWEEN_FRONT));
                    break;
                default:
                    //TODO Exception
                    break;
            }
        }
    }

    private String dealInOrNotIn(String value) {
        String[] values = value.split(",");
        StringBuilder result = new StringBuilder();
        result.append("(");
        for(String s : values) {
            result.append("\"" + s + "\",");
        }
        if(result.toString().endsWith(",")) {
            result.deleteCharAt(result.length() - 1);
        }
        result.append(")");
        return result.toString();
    }

    private void packageWhere() {
        //TODO
    }

    //GroupBy------------------------------------------------------------//
    public void groupBy(String properties) {
        this.addGroupBy(properties);
    }

    private void addGroupBy(String properties) {
        this.groupBySet.add(new KeyValue(properties, null));
    }

    private void packageGroupBy() {
        //TODO
    }

    //Having------------------------------------------------------------//
    public void havingAVG(String properties, String value, int cal) {
        int[] collection = new int[]{
                HAVING_AVG_LIKE, HAVING_AVG_NOT_LIKE, HAVING_AVG_EQ, HAVING_AVG_NOT_EQ,
                HAVING_AVG_LT, HAVING_AVG_LE, HAVING_AVG_GT, HAVING_AVG_GE
        };
        this.havingPublic(properties, value, cal, collection);
    }

    public void havingCount(String properties, String value, int cal){
        int[] collection = new int[]{
                HAVING_COUNT_LIKE, HAVING_COUNT_NOT_LIKE, HAVING_COUNT_EQ, HAVING_COUNT_NOT_EQ,
                HAVING_COUNT_LT, HAVING_COUNT_LE, HAVING_COUNT_GT, HAVING_COUNT_GE
        };
        this.havingPublic(properties, value, cal, collection);
    }

    public void havingMax(String properties, String value, int cal){
        int[] collection = new int[]{
                HAVING_MAX_LIKE, HAVING_MAX_NOT_LIKE, HAVING_MAX_EQ, HAVING_MAX_NOT_EQ,
                HAVING_MAX_LT, HAVING_MAX_LE, HAVING_MAX_GT, HAVING_MAX_GE
        };
        this.havingPublic(properties, value, cal, collection);
    }

    public void havingMin(String properties, String value, int cal){
        int[] collection = new int[]{
                HAVING_MIN_LIKE, HAVING_MIN_NOT_LIKE, HAVING_MIN_EQ, HAVING_MIN_NOT_EQ,
                HAVING_MIN_LT, HAVING_MIN_LE, HAVING_MIN_GT, HAVING_MIN_GE
        };
        this.havingPublic(properties, value, cal, collection);
    }

    public void havingSum(String properties, String value, int cal){
        int[] collection = new int[]{
                HAVING_SUM_LIKE, HAVING_SUM_NOT_LIKE, HAVING_SUM_EQ, HAVING_SUM_NOT_EQ,
                HAVING_SUM_LT, HAVING_SUM_LE, HAVING_SUM_GT, HAVING_SUM_GE
        };
        this.havingPublic(properties, value, cal, collection);
    }

    private void havingPublic(String properties, String value, int cal, int[] collection) {
        switch (cal) {
            case CAL_LIKE:
                this.addHaving(properties, value, collection[0]);
                break;
            case CAL_NOT_LIKE:
                this.addHaving(properties, value, collection[1]);
                break;
            case CAL_EQ:
                this.addHaving(properties, value, collection[2]);
                break;
            case CAL_NOT_EQ:
                this.addHaving(properties, value, collection[3]);
                break;
            case CAL_LT:
                this.addHaving(properties, value, collection[4]);
                break;
            case CAL_LE:
                this.addHaving(properties, value, collection[5]);
                break;
            case CAL_GT:
                this.addHaving(properties, value, collection[6]);
                break;
            case CAL_GE:
                this.addHaving(properties, value, collection[7]);
                break;
            default:
                break;
        }
    }

    private void addHaving(String properties, String value, int realOperation) {
        if(this.isExistProperties(this.entityClass, properties)) {
            this.haveSet.add(new KeyValue(properties, value, realOperation));
        }
    }

    private void packageHaving() {
        //TODO
    }

    //OrderBy------------------------------------------------------------//
    public void orderByAsc(String properties) {
        this.addOrderBy(properties, ORDER_BY_ASC);
    }

    public void orderByDesc(String properties) {
        this.addOrderBy(properties, ORDER_BY_DESC);
    }

    private void addOrderBy(String properties, int operation) {
        if(this.isExistProperties(this.entityClass, properties)) {
            switch (operation) {
                case ORDER_BY_ASC:
                    this.orderBySet.add(new KeyValue(properties, ORDER_BY_SQL_ASC));
                    break;
                case ORDER_BY_DESC:
                    this.orderBySet.add(new KeyValue(properties, ORDER_BY_SQL_DESC));
                    break;
                default:
                    //TODO Exception
                    break;
            }
        } else {
            //TODO Exception
        }
    }

    private void packageOrderBy() {
        //TODO
    }

    //LIMIT------------------------------------------------------------//
    public void limit(int pageSize) {
        this.addLimit(0, pageSize);
    }

    public void limit(int page, int pageSize) {
        this.addLimit((page - 1) * pageSize, pageSize);
    }

    private void addLimit(int page, int pageSize) {
        this.limitMap.put("page", page);
        this.limitMap.put("pageSize", pageSize);
    }

    private void packageLimit() {
        if(this.limitMap.size() > 0) {
            this.limitStatement = new StringBuilder(PERFIX_LIMIT);
            String min = this.limitMap.get("page").toString();
            String max = this.limitMap.get("pageSize").toString();
            this.limitStatement.append(min + "," + max);
        } else {
            this.limitStatement = new StringBuilder("");
        }
    }
}
