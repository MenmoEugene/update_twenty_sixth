/*
StaticImport ��̬���롣

����������ʱ����Ҫָ������İ�����
����������ʱ��ָ���߱������Ķ�������ࡣ
*/
import java.util.*;
import static java.util.Arrays.*;//�������Arrays������е����о�̬��Ա��

/*
packa/Demo.class
packb/Demo.class

import packa.*;
import packb.*;

*/
import static java.lang.System.*;//������System�������о�̬��Ա

class StaticImport extends Object 
{
	public static void main(String[] args) 
	{
		out.println("haha");
		int[] arr = {3,1,5};

		sort(arr);
		int index = binarySearch(arr,1);

		System.out.println(Arrays.toString(arr));
		System.out.println("Index="+index);

	}
}
