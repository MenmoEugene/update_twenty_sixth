/*
�߼�forѭ��

��ʽ��
	for(�������� ���������������ļ���(Collection)��������)
	{
	
	}

�Լ��Ͻ��б�����
ֻ�ܻ�ȡԪ�أ����ǲ��ܶԼ��Ͻ��в�����

���������˱����������Խ���remove������Ԫ�صĶ�����
���ʹ��ListIterator���������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ�����

��ͳforѭ���͸߼�forѭ����ʲô�����أ�

�߼�for��һ�������ԡ������б�������Ŀ�ꡣ

���飺�ڱ��������ʱ�򣬻���ϣ��ʹ�ô�ͳfor����Ϊ��ͳfor���Զ���űꡣ
*/
import java.util.*;
class ForEachDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		for(Object s:al)
		{
//			s = "kk";
			System.out.println(s);
		}

		System.out.println(al);
/*
		Iterator<String> it = al.iterator();

		while(is.hasNext())
		{
			System.out.println(it.next());
		}

		
*/		
		int[] arr = {3,5,1};
		for (int x=0; x<arr.length; x++)
		{
			System.out.println(arr[x]);
		}
		for(int i:arr)
		{
			System.out.println("i"+i);
		}

		HashMap<Integer,String> hm =new HashMap<Integer,String>();

		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");

		Set<Integer> keySet = hm.keySet();
		for(Integer i : keySet)
		{
			System.out.println(i+"::"+hm.get(i));
		}

//		Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();
//		for(Map.Entry<Integer,String> me : entrySet);

		for(Map.Entry<Integer,String> me:hm.entrySet())
		{
			System.out.println(me.getKey()+"-------"+me.getValue());
		}

	}
}