/*
JDK1.5�汾���ֵ������ԡ�

��ʹ�÷����Ŀɱ����ʱ��ע�⣺
	�ɱ����һ��Ҫ�����ڲ����б�����档
*/
class ParamMethodDemo
{
	public static void main(String[] args) 
	{
		//show(3,4);
		//��Ȼ�ٶ����˶������������ÿ�ζ�Ҫ����һ�����飬��Ϊʵ�ʲ�����
		//int[] arr = {3,4};
		//int[] arr1 = {3,4,5};
//		show(arr1);

/*
	�ɱ������
	��ʵ������һ����������ļ�д��ʽ��
	����ÿһ�ζ��ֶ��Ľ����������
	ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ��ɡ�
	��ʽ����Щ������װ�������顣
*/
		show("hehe",2,3,6,5,8);
//		show();
	}
	public static void show(String str,int... arr)
	{
		System.out.println(arr.length);
	}
/*
	public static void show(int[] arr)
	{
	
	}

	public void show(int a,int b)
	{
		System.out.println(a+","+b);
	}
*/

}
