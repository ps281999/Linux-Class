    package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap();
        ArrayList<String>list = new ArrayList<String>();
        Map<String, Map>maplist=new HashMap<String,Map>();
        list.add("1ay18is405");
        list.add("1ay18is406");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            ArrayList<String> sname = new ArrayList<>();
            for (int j = 0; j < 2; j++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student name");
                sname.add(sc.next());
            }
            ArrayList<String> branch = new ArrayList<>();
            for (int k = 0; k < 2; k++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student branch");
                branch.add(sc.next());
            }
            ArrayList<String> college = new ArrayList<>();
            for (int m = 0; m < 2; m++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student College");
                college.add(sc.next());
            }
            ArrayList<String> Yop = new ArrayList<>();
            for (int n = 0; n < 2; n++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student Year of Pass");
                Yop.add(sc.next());
            }
            ArrayList<String> Age = new ArrayList<>();
            for (int o = 0; o < 2; o++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student Age");
                Age.add(sc.next());
            }
            ArrayList<String> place = new ArrayList<>();
            for (int p = 0; p < 2; p++)
            {
                Map<String,String> mlist = new HashMap<String,String>();
                System.out.println("Enter" + list.get(i) + "student Place");
                Age.add(sc.next());
            }
            maplist.put("1ay18is405", (Map) sname);
            maplist.put("1ay18is405", (Map) branch);
            maplist.put("1ay18is405", (Map) college);
            maplist.put("1ay18is405", (Map) Yop);
            maplist.put("1ay18is405", (Map) Age);
            maplist.put("1ay18is405", (Map) place);
        }
    }
}

	        }
	    }
	}
}
