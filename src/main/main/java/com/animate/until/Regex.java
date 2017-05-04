package com.animate.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class Regex {

    //校验数字的表达式
    public static final String REG1_01 = "^[0-9]*$";//纯数字
    public static final String REG1_02 = "^\\d{n}$";//n位数字
    public static final String REG1_03 = "^\\d{n,}$";//至少n位数字
    public static final String REG1_04 = "^\\d{m,n}$";//m-n位数字
    public static final String REG1_05 = "^(0|[1-9][0-9]*)$";//零和非零开头的数字
    public static final String REG1_06 = "^([1-9][0-9]*)+(.[0-9]{1,2})?$";//非零开头的最多带两位小数的数字
    public static final String REG1_07 = "^(\\-)?\\d+(\\.\\d{1,2})?$";// 带1-2位小数的正数或负数
    public static final String REG1_08 = "^(\\-|\\+)?\\d+(\\.\\d+)?$";//正数、负数、和小数
    public static final String REG1_09 = "^[0-9]+(.[0-9]{2})?$";//有两位小数的正实数
    public static final String REG1_10 = "^[0-9]+(.[0-9]{1,3})?$";//有1~3位小数的正实数
    public static final String REG1_11 = "^[1-9]\\d*$";//非零的正整数 模式一
    public static final String REG1_12 = "^([1-9][0-9]*){1,3}$";//非零的正整数 模式二 有位数限制
    public static final String REG1_13 = "^\\+?[1-9][0-9]*$";//非零的正整数 模式三 判断正负号
    public static final String REG1_14 = "^\\-[1-9][]0-9\"*$";//非零的负整数 模式一
    public static final String REG1_15 = "^-[1-9]\\d*$";//非零的负整数 模式二
    public static final String REG1_16 = "^\\d+$";//非负整数 模式一
    public static final String REG1_17 = "^[1-9]\\d*|0$";//非负整数 模式二
    public static final String REG1_18 = "^-[1-9]\\d*|0$";//非正整数 模式一
    public static final String REG1_19 = "^((-\\d+)|(0+))$";//非正整数 模式二
    public static final String REG1_20 = "^\\d+(\\.\\d+)?$";//非负浮点数 模式一
    public static final String REG1_21 = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0$";//非负浮点数 模式二
    public static final String REG1_22 = "^((-\\d+(\\.\\d+)?)|(0+(\\.0+)?))$"; //非正浮点数 模式一
    public static final String REG1_23 = "^(-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*))|0?\\.0+|0$";//非正浮点数 模式二
    public static final String REG1_24 = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";//正浮点数 模式一
    public static final String REG1_25 = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";//正浮点数 模式二
    public static final String REG1_26 = "^-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*)$";//负浮点数 模式一
    public static final String REG1_27= "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";//负浮点数 模式二
    public static final String REG1_28 = "^(-?\\d+)(\\.\\d+)?$";//浮点数 模式一
    public static final String REG1_29 = "^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$";//浮点数 模式二

    //校验字符的表达式
    public static final String REG2_1 = "^[\u4e00-\u9fa5]{0,}$";//汉字
    public static final String REG2_2 = "^[A-Za-z0-9]+$";//英文和数字
    public static final String REG2_3 = "^.{3,20}$";//长度为3-20的所有字符
    public static final String REG2_4 = "^[A-Za-z]+$";//由26个英文字母组成的字符串
    public static final String REG2_5 = "^[A-Z]+$";//由26个大写英文字母组成的字符串
    public static final String REG2_6 = "^[a-z]+$";//由26个小写英文字母组成的字符串
    public static final String REG2_7 = "^[A-Za-z0-9]+$";//由数字和26个英文字母组成的字符串
    public static final String REG2_8 = "^\\w+$";//由数字、26个英文字母或者下划线组成的字符串
    public static final String REG2_9 = "^[\u4E00-\u9FA5A-Za-z0-9_]+$";//中文、英文、数字包括下划线
    public static final String REG2_10 = "^[\u4E00-\u9FA5A-Za-z0-9]+$";//中文、英文、数字但不包括下划线等符号
    public static final String REG2_11 = "[^\\%\\&',;\\=\\?\\$\\x22]+";//输入含有^%&',;=?$\"等字符
    public static final String REG2_12 = "[^~\\x22]+";//禁止输入含有~的字符

    //特殊需求的表达式
    public static final String REG3_1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";//Email地址
    public static final String REG3_2 = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";//域名
    public static final String REG3_3 = "[a-zA-z]+://[^\\s]*";//InternetURL
    public static final String REG3_4 = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";//手机号码
    public static final String REG3_5 = "^(\\(\\d{3,4}-)|\\d{3.4}-)?\\d{7,8}$";//电话号码("XXX-XXXXXXX"、"XXXX-XXXXXXXX"、"XXX-XXXXXXX"、"XXX-XXXXXXXX"、"XXXXXXX"和"XXXXXXXX)
    public static final String REG3_6 = "\\d{3}-\\d{8}|\\d{4}-\\d{7}";//国内电话号码(0511-4405222、021-87888822)
    public static final String REG3_7 = "^\\d{15}|\\d{18}$";//身份证号-15或18位身份证
    public static final String REG3_8 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";//身份证号-15位身份证
    public static final String REG3_9 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{4}$";//身份证号-18位身份证
    public static final String REG3_10 = "^([0-9]){7,18}(x|X)?$";//短身份证号码(数字、字母x结尾)
    public static final String REG3_11 = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";//帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
    public static final String REG3_12 = "^[a-zA-Z]\\w{5,17}$";//密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
    public static final String REG3_13 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$";//强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间)
    public static final String REG3_14 = "^\\d{4}-\\d{1,2}-\\d{1,2}";//日期格式
    public static final String REG3_15 = "^(0?[1-9]|1[0-2])$";//一年的12个月(01～09和1～12)
    public static final String REG3_16 = "^((0?[1-9])|((1|2)[0-9])|30|31)$";//一个月的31天(01～09和1～31)
    public static final String REG3_17 = "^[1-9][0-9]*$";//1.有四种钱的表示形式我们可以接受"10000.00"和"10,000.00",和没有"分"的"10000"和"10,000"
    public static final String REG3_18 = "^(0|[1-9][0-9]*)$";//2.这表示任意一个不以0开头的数字,但是,这也意味着一个字符"0"不通过,所以我们采用下面的形式
    public static final String REG3_19 = "^(0|-?[1-9][0-9]*)$";//3.一个0或者一个不以0开头的数字.我们还可以允许开头有一个负号
    public static final String REG3_20 = "^[0-9]+(.[0-9]+)?$";//4.这表示一个0或者一个可能为负的开头不为0的数字.让用户以0开头好了.把负号的也去掉,因为钱总不能是负的吧.下面我们要加的是说明可能的小数部分
    public static final String REG3_21 = "^[0-9]+(.[0-9]{2})?$";//5.必须说明的是,小数点后面至少应该有1位数,所以"10."是不通过的,但是"10"和"10.2"是通过的
    public static final String REG3_22 = "^[0-9]+(.[0-9]{1,2})?$";//6.这样我们规定小数点后面必须有两位,如果你认为太苛刻了,可以这样
    public static final String REG3_23 = "^[0-9]{1,3}(,[0-9]{3})*(.[0-9]{1,2})?$";//7.这样就允许用户只写一位小数.下面我们该考虑数字中的逗号了,我们可以这样
    public static final String REG3_24 = "^([0-9]+|[0-9]{1,3}(,[0-9]{3})*)(.[0-9]{1,2})?$";//8.1到3个数字,后面跟着任意个逗号+3个数字,逗号成为可选,而不是必须
    public static final String REG3_25 = "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$";//xml文件
    public static final String REG3_26 = "[\u4e00-\u9fa5]";//中文字符的正则表达式
    public static final String REG3_27 = "[^\\x00-\\xff]";//双字节字符
    public static final String REG3_28 = "\\n\\s*\\r";//空白行的正则表达式
    public static final String REG3_29 = "<(\\S*?)[^>]*>.*?|<.*? />";//HTML标记的正则表达式
    public static final String REG3_30 = "^\\s*|\\s*$或(^\\s*)|(\\s*$)";//首尾空白字符的正则表达式
    public static final String REG3_31 = "[1-9][0-9]{4,}";//腾讯QQ号
    public static final String REG3_32 = "[1-9]\\d{5}(?!\\d)";//中国邮政编码
    public static final String REG3_33 = "\\d+\\.\\d+\\.\\d+\\.\\d+";//IP地址

    public static boolean matches(String str, String pattern) {
        Pattern patterner = Pattern.compile(pattern);
        Matcher matcher = patterner.matcher(str);
        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

}

//\
//将下一字符标记为特殊字符、文本、反向引用或八进制转义符。例如，"n"匹配字符"n"。"\n"匹配换行符。序列"\\"匹配"\"，"\("匹配"("。
//^
//匹配输入字符串开始的位置。如果设置了 RegExp 对象的 Multiline 属性，^ 还会与"\n"或"\r"之后的位置匹配。
//$
//匹配输入字符串结尾的位置。如果设置了 RegExp 对象的 Multiline 属性，$ 还会与"\n"或"\r"之前的位置匹配。
//*
//零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
//+
//一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
//?
//零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
//{n}
//n 是非负整数。正好匹配 n 次。例如，"o{2}"与"Bob"中的"o"不匹配，但与"food"中的两个"o"匹配。
//{n,}
//n 是非负整数。至少匹配 n 次。例如，"o{2,}"不匹配"Bob"中的"o"，而匹配"foooood"中的所有 o。"o{1,}"等效于"o+"。"o{0,}"等效于"o*"。
//{n,m}
//M 和 n 是非负整数，其中 n <= m。匹配至少 n 次，至多 m 次。例如，"o{1,3}"匹配"fooooood"中的头三个 o。'o{0,1}' 等效于 'o?'。注意：您不能将空格插入逗号和数字之间。
//?
//当此字符紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}）之后时，匹配模式是"非贪心的"。"非贪心的"模式匹配搜索到的、尽可能短的字符串，而默认的"贪心的"模式匹配搜索到的、尽可能长的字符串。例如，在字符串"oooo"中，"o+?"只匹配单个"o"，而"o+"匹配所有"o"。
//.
//匹配除"\r\n"之外的任何单个字符。若要匹配包括"\r\n"在内的任意字符，请使用诸如"[\s\S]"之类的模式。
//(pattern)
//匹配 pattern 并捕获该匹配的子表达式。可以使用 $0…$9 属性从结果"匹配"集合中检索捕获的匹配。若要匹配括号字符 ( )，请使用"\("或者"\)"。
//(?:pattern)
//匹配 pattern 但不捕获该匹配的子表达式，即它是一个非捕获匹配，不存储供以后使用的匹配。这对于用"or"字符 (|) 组合模式部件的情况很有用。例如，'industr(?:y|ies) 是比 'industry|industries' 更经济的表达式。
//(?=pattern)
//执行正向预测先行搜索的子表达式，该表达式匹配处于匹配 pattern 的字符串的起始点的字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?=95|98|NT|2000)' 匹配"Windows 2000"中的"Windows"，但不匹配"Windows 3.1"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
//(?!pattern)
//执行反向预测先行搜索的子表达式，该表达式匹配不处于匹配 pattern 的字符串的起始点的搜索字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?!95|98|NT|2000)' 匹配"Windows 3.1"中的 "Windows"，但不匹配"Windows 2000"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
//x|y
//匹配 x 或 y。例如，'z|food' 匹配"z"或"food"。'(z|f)ood' 匹配"zood"或"food"。
//[xyz]
//字符集。匹配包含的任一字符。例如，"[abc]"匹配"plain"中的"a"。
//[^xyz]
//反向字符集。匹配未包含的任何字符。例如，"[^abc]"匹配"plain"中"p"，"l"，"i"，"n"。
//[a-z]
//字符范围。匹配指定范围内的任何字符。例如，"[a-z]"匹配"a"到"z"范围内的任何小写字母。
//[^a-z]
//反向范围字符。匹配不在指定的范围内的任何字符。例如，"[^a-z]"匹配任何不在"a"到"z"范围内的任何字符。
//\b
//匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
//\B
//非字边界匹配。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"。
//\cx
//匹配 x 指示的控制字符。例如，\cM 匹配 Control-M 或回车符。x 的值必须在 A-Z 或 a-z 之间。如果不是这样，则假定 c 就是"c"字符本身。
//\d
//数字字符匹配。等效于 [0-9]。
//\D
//非数字字符匹配。等效于 [^0-9]。
//\f
//换页符匹配。等效于 \x0c 和 \cL。
//\n
//换行符匹配。等效于 \x0a 和 \cJ。
//\r
//匹配一个回车符。等效于 \x0d 和 \cM。
//\s
//匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。
//\S
//匹配任何非空白字符。与 [^ \f\n\r\t\v] 等效。
//\t
//制表符匹配。与 \x09 和 \cI 等效。
//\v
//垂直制表符匹配。与 \x0b 和 \cK 等效。
//\w
//匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。
//\W
//与任何非单词字符匹配。与"[^A-Za-z0-9_]"等效。
//\xn
//匹配 n，此处的 n 是一个十六进制转义码。十六进制转义码必须正好是两位数长。例如，"\x41"匹配"A"。"\x041"与"\x04"&"1"等效。允许在正则表达式中使用 ASCII 代码。
//\num
//匹配 num，此处的 num 是一个正整数。到捕获匹配的反向引用。例如，"(.)\1"匹配两个连续的相同字符。
//\n
//标识一个八进制转义码或反向引用。如果 \n 前面至少有 n 个捕获子表达式，那么 n 是反向引用。否则，如果 n 是八进制数 (0-7)，那么 n 是八进制转义码。
//\nm
//标识一个八进制转义码或反向引用。如果 \nm 前面至少有 nm 个捕获子表达式，那么 nm 是反向引用。如果 \nm 前面至少有 n 个捕获，则 n 是反向引用，后面跟有字符 m。如果两种前面的情况都不存在，则 \nm 匹配八进制值 nm，其中 n 和 m 是八进制数字 (0-7)。
//\nml
//当 n 是八进制数 (0-3)，m 和 l 是八进制数 (0-7) 时，匹配八进制转义码 nml。
//\\un
//匹配 n，其中 n 是以四位十六进制数表示的 Unicode 字符。例如，\u00A9 匹配版权符号 (?)。
