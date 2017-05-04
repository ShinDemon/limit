package com.animate.until;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class Sort {

    /**
     * 直接插入排序(straight insertion sort)
     * 1、  直接插入排序：
     * ①   思想：最基本的插入排序，将第i个插入到前i-1个中的适当位置。
     * ②   时间复杂度：T(n) = O(n²)。
     * ③   空间复杂度：S(n) = O(1)。
     * @param array
     * @return
     */
    public static int[] straightInsertion(int[] array) {
        int[] res = new int[array.length];
        res[0] = array[0];
        for(int i=1,l=array.length; i<l; i++) {
            res[i] = array[i];
            for(int j=i-1; j>=0; j--) {
                if(res[j+1] > res[j]) {
                    break;
                } else {
                    swap(res, j, j+1);
                }
            }
            printArray(res);
        }
        return res;
    }

    /**
     * 折半插入排序(binary insertion sort)
     * 2、  折半插入排序：
     * ①   思想：因为是已经确定了前部分是有序序列，所以在查找插入位置的时候可以用折半查找的方法进行查找，提高效率。
     * ②   时间复杂度：比较时的时间减为O(n㏒n)，但是移动元素的时间耗费未变，所以总是得时间复杂度还是O(n²)。
     * ③   空间复杂度：S(n) = O(1)。
     * ④   稳定性：稳定排序。
     * @param array
     * @return
     */
    public static int[] binaryInsertion(int[] array) {
        int[] res = new int[array.length];
        res[0] = array[0];
        for(int i=1; i<array.length; i++) {
            int temp = array[i];
            int low = 0, high = i-1, mid;
            while(low <= high && low >= 0 && high >= 0) {
                mid = (low + high) / 2;
                if(res[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for(int j=i-1; j>=low; j--) {
                res[j+1] = res[j];
            }
            res[low] = temp;
        }
        return res;
    }

    /**
     * 希尔排序(Shell Sort)
     * 3、  希尔排序：
     * ①   思想：又称缩小增量排序法。把待排序序列分成若干较小的子序列，然后逐个使用直接插入排序法排序，最后再对一个较为有序的序列进行一次排序，主要是为了减少移动的次数，提高效率。原理应该就是从无序到渐渐有序，要比直接从无序到有序移动的次数会少一些。
     * ②   时间复杂度：O(n的1.5次方)
     * ③   空间复杂度：O(1)
     * ④   稳定性：不稳定排序。{2,4,1,2}，2和1一组4和2一组，进行希尔排序，第一个2和最后一个2会发生位置上的变化。
     * @return
     */
    public static void shellSort(int[] array) {
        int i, j, gap, length = array.length;
        for (gap = length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < length; i++) {
                for (j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap){
                    swap(array, j, j+gap);
                }
            }
        }
    }

    /**
     * 1、  冒泡排序：
     * ①   思想：反复扫描待排序序列，在扫描的过程中顺次比较相邻的两个元素的大小，若逆序就交换位置。第一趟，从第一个数据开始，比较相邻的两个数据，（以升序为例）如果大就交换，得到一个最大数据在末尾；然后进行第二趟，只扫描前n-1个元素，得到次大的放在倒数第二位。以此类推，最后得到升序序列。如果在扫描过程中，发现没有交换，说明已经排好序列，直接终止扫描。所以最多进行n-1趟扫描。
     * ②   时间复杂度：T(n) = O(n²)。
     * ③   空间复杂度：S(n) = O(1)。
     * ④   稳定性：稳定排序。
     * 冒泡排序（Bubble Sort）
     * @param array
     */
    public static void bubble(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    /**
     * 快速排序（QuickSort）
     * 2、  快速排序：
     * ①   思想：冒泡排序一次只能消除一个逆序，为了能一次消除多个逆序，采用快速排序。以一个关键字为轴，从左从右依次与其进行对比，然后交换，第一趟结束后，可以把序列分为两个子序列，然后再分段进行快速排序，达到高效。
     * ②   时间复杂度：平均T(n) = O(n㏒n)，最坏O(n²)。
     * ③   空间复杂度：S(n) = O(㏒n)。
     * ④   稳定性：不稳定排序。{3， 2， 2}
     */
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int low, int high) {
        int pos;
        if(low < high) {
            pos = quickPass(array, low, high);
            quickSort(array, low, pos-1);
            quickSort(array, pos+1, high);
        }
    }

    private static int quickPass(int array[], int left, int right) {
        int temp = array[left], low = left, high = right;
        while(low < high) {
            while(low < high && array[high] >= temp)
                high--;
            if(low < high) {
                swap(array, low, high);
                low++;
            }
            while(low < high && array[low] < temp)
                low++;
            if(low < high) {
                swap(array, low, high);
                high--;
            }
        }
        return low;
    }

    /**
     * 简单选择排序
     * 1、  简单选择排序：
     * ①   思想：第一趟时，从第一个记录开始，通过n – 1次关键字的比较，从n个记录中选出关键字最小的记录，并和第一个记录进行交换。第二趟从第二个记录开始，选择最小的和第二个记录交换。以此类推，直至全部排序完毕。
     * ②   时间复杂度：T(n) = O(n²)。
     * ③   空间复杂度：S(n) = O(1)。
     * ④   稳定性：不稳定排序，{3， 3， 2}。
     * @param array
     */
    public static void simpleSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int min = i;
            for(int j=i; j<array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array, min, i);
            printArray(array);
        }
    }

    /**
     * 树形选择排序又称锦标赛排序（Tournament Sort）
     * 2、  树形选择排序：
     * ①   思想：为了减少比较次数，两两进行比较，得出的较小的值再两两比较，直至得出最小的输出，然后在原来位置上置为∞，再进行比较。直至所有都输出。
     * ②   时间复杂度：T(n) = O(n㏒n)。
     * ③   空间复杂度：较简单选择排序，增加了n-1个额外的存储空间存放中间比较结果，就是树形结构的所有根节点。S(n) = O(n)。
     * ④   稳定性：稳定排序。
     * 实现原理：
     * 第一步，首先对n个记录进行两两比较，得到较小的n/2个数再依次比较，依次类推
     * 直到得到一个最小值,这是一个构造完全二叉树的过程，根节点即为最小元素，叶子节点为列表元素。
     * 构造的此树的存储结构可以用数组表示方法，数组长度为2n-1。填充此树，比如
     * 列表元素为：49    38     65    97   76    13    27   49
     * 构造的树为：                     13
     *                     38               13
     *                38       65       13       27
     *              19  38   65  97   76  13   27  49
     * 13为根结点位最小值，列表元素为叶子节点
     *
     * 第二步，移走最小元素，此时可重新为数组a的第一个位置赋值为此最小值，
     * 之后如果找出次小值则可以为第二个位置赋值，......
     *
     * 第三步，找出次小值，找出最小值在叶子节点的位置，从该节点开始，和其兄弟节点
     * 进行比较，修改从叶子节点到根节点的元素值，比较完毕后，根节点为次小值。
     * 第三步比较是利用了第一次比较提供的信息，因为第一步已经得到了两两比较的
     * 较小值，只要拿第一次与最小值比较的元素(即最小值的兄弟节点)与它们比较即可得最小值。
     * 即拿上述例子的76与27比较，然后27与38比较得到次小值27。
     * 重复第二和第三步，排序完成。
     *
     * PS:这里把移出去的叶子节点都要重设为最大值，可对此方法进行稍微改动
     * 可传一个最大值进来，这里是整型所以用了Integer.MAX_VALUE
     * @param array
     */
    public static void treeSort(int[] array) {
        int len = array.length;
        int treeSize = 2 * len - 1;  //完全二叉树的节点数
        int low = 0;
        int[] tree = new int[treeSize];    //临时的树存储空间
        //由后向前填充此树，索引从0开始
        for(int i = len-1,j=0 ;i >= 0; --i,j++){      //填充叶子节点
            tree[treeSize-1-j] = array[i];
        }

        for(int i = treeSize-1;i>0;i-=2){ //填充非终端节点
            tree[(i-1)/2] = ((Comparable)tree[i-1]).compareTo(tree[i]) < 0 ? tree[i-1]:tree[i];
        }
        //不断移走最小节点
        int minIndex;
        while(low < len){
            int min = tree[0];    //最小值
            array[low++] = min;
            minIndex = treeSize-1;
            //找到最小值的索引
            while(((Comparable)tree[minIndex]).compareTo(min)!=0){
                minIndex--;
            }
            tree[minIndex] = Integer.MAX_VALUE;  //设置一个最大值标志
            //找到其兄弟节点
            while(minIndex > 0){      //如果其还有父节点
                if(minIndex % 2 == 0){   //如果是右节点
                    tree[(minIndex-1)/2] = ((Comparable)tree[minIndex-1]).compareTo(tree[minIndex])
                            < 0 ? tree[minIndex-1]:tree[minIndex];
                    minIndex = (minIndex-1)/2;
                }else{                   //如果是左节点
                    tree[minIndex/2] = ((Comparable)tree[minIndex]).compareTo(tree[minIndex+1])
                            < 0 ? tree[minIndex]:tree[minIndex+1];
                    minIndex = minIndex/2;
                }
            }

        }
    }

    /**
     * 堆排序(Heapsort)
     * 3、  堆排序：
     * ①   思想：把待排序记录的关键字存放在数组r[1…n]中，将r看成是一刻完全二叉树的顺序表示，每个节点表示一个记录，第一个记录r[1]作为二叉树的根，一下个记录r[2…n]依次逐层从左到右顺序排列，任意节点r[i]的左孩子是r[2i]，右孩子是r[2i+1]，双亲是r[i/2向下取整]。然后对这棵完全二叉树进行调整建堆。
     * ②   时间复杂度：T(n) = O(n㏒n)。
     * ③   空间复杂度：S(n) = O(1)。
     * ④   稳定性：不稳定排序。{5， 5， 3}
     * 实现原理：
     *    首先将序列看成一个树形结构，
     * 1.构建堆的过程：找到最后一个非终端节点n/2，与它的左右子节点比较，
     * 比较结果使此父节点为这三个节点的最小值。再找n/2-1这个节点，
     * 与其左右子节点比较，得到最小值，以此类推....，最后根节点即为最小值
     * 比如：49  38   65   97   76   13   27   49
     * 初始树为：
     *              49
     *        38              65
     *    97      76      13       27
     * 49
     * 构造堆后的树为
     *              13
     *       38              27
     *    49    76       65       49
     *  97
     *  交换数据的顺序为：97<——>49, 13<--->65,38不用换，49<-->13,13<-->27
     * 2.输出堆顶元素并调整建新堆的过程
     *    输出堆顶最小值后，假设以最后一个值替代之，由于其左右子树的堆结构并没有被破坏
     * 只需要自上而下进行调整。比如把上图的13输出后以97替代，然后可以把97与27交换，
     * 然后97又与49交换，此时最小值为根元素27，输出27后以又用最后一个值替换根元素，
     * 以此类推，则最终得到有序序列
     * @param array
     */
    public static void heapSort(int[] array){
        int len = array.length;
        //构建堆
        for(int i=(len-1)/2;i>=0;i--){
            heapAdjust(array,i,len);
        }
        //输出堆顶元素并调整建新堆的过程
        int count = len-1;
        while(count > 0 ){
            //交换树根与最后一个值
            swap(array,0,count);
            count -- ;
            heapAdjust(array,0,count);
        }
    }

    /**
     * 调整某一个节点极其左右子节点的位置 ，并选择左右节点中的较大者
     * 继续向下调整
     */
    private static void heapAdjust(int[] array,int i,int len){
        int parent = array[i];
        for(int j = (i+1) * 2 - 1;j < len; j = (j+1) * 2 - 1){   //沿着左右节点中的较小者继续往下搜索
            if(j < len-1 && ((Comparable)array[j]).compareTo(array[j+1]) < 0 ){
                ++j;        //如果左节点较大过度到右节点
            }
            if(((Comparable)parent).compareTo(array[j]) > 0) //左右节点均小于父节点则不必要继续向下搜索
                break;
            array[i] = array[j];
            i = j ;
        }
        array[i] = parent;      //parent插入到正确的位置

    }

    /**
     * 归并排序（MERGE-SORT）
     * 1、  归并排序：
     * ①   思想：假设初始序列右n个记录，首先将这n个记录看成n个有序的子序列，每个子序列的长度为1，然后两两归并，得到n/2向上取整 个长度为2（n为奇数时，最后一个序列的长度为1）的有序子序列。在此基础上，在对长度为2的有序子序列进行两两归并，得到若干个长度为4的有序子序列。如此重复，直至得到一个长度为n的有序序列为止。
     * ②   时间复杂度：T(n) = O(n㏒n)。
     * ③   空间复杂度：S(n) = O(n)。
     * ④   稳定性：稳定排序。
     * @param array
     */
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length-1);
    }

    /**
     * 归并排序
     * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
     * 时间复杂度为O(nlogn)
     * 稳定排序方式
     * @param array
     * @return 输出有序数组
     */
    private static void mergeSort(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(array, low, mid);
            // 右边
            mergeSort(array, mid + 1, high);
            // 左右归并
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }

    /**
     * 交换数值
     * @param array
     * @param x
     * @param y
     */
    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    /**
     * 输出数组
     * @param arr
     */
    public static void printArray(int[] arr) {
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<arr.length; i++) {
            str.append(arr[i] + " ");
        }
        System.out.println(str);
    }
}
