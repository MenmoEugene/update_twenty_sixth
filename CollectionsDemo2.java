import java.util.*;
class CollectionsDemo2
{
	public static void main(String[] args) 
	{
//		fillDemo();
		replaceAllDemo();
	}

	public static void replaceAllDemo()
	{
		List<String> list = new ArrayList<String>();

		list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");

		sop(list);
		//�ַ����滻
		Collections.replaceAll(list,"aaa","pp");
		
		//���鷴ת
		Collections.reverse(list);
		sop(list);
	}
	/*
	��ϰ��fill�������Խ�list����������Ԫ���滻��ָ��Ԫ�ء�
		��list�����в���Ԫ���滻��ָ��Ԫ�ء�

	*/
	public static void fillDemo()
	{
		List<String> list = new ArrayList<String>();

		list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");

		sop(list);
		Collections.fill(list,"pp");
		sop(list);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
