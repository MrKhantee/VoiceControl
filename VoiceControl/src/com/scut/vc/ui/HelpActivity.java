package com.scut.vc.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.widget.SimpleExpandableListAdapter;

public class HelpActivity extends ExpandableListActivity   {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        
        //��������һ����Ŀ����   
        Map<String, String> title_1 = new HashMap<String, String>();  
        Map<String, String> title_2 = new HashMap<String, String>();  
        Map<String, String> title_3 = new HashMap<String, String>(); 
        Map<String, String> title_4 = new HashMap<String, String>(); 
        Map<String, String> title_5 = new HashMap<String, String>(); 
        Map<String, String> title_6 = new HashMap<String, String>(); 
        Map<String, String> title_7 = new HashMap<String, String>(); 
          
        title_1.put("group", "����绰");  
        title_2.put("group", "���Ͷ���"); 
        title_3.put("group", "��Ӧ��");
        title_4.put("group", "��������");
        title_5.put("group", "��������");
        title_6.put("group", "����ϵͳ");
        title_7.put("group", "��ѯ����");
          
        //����һ����Ŀ����   
        List<Map<String, String>> gruops = new ArrayList<Map<String,String>>();  
          
        gruops.add(title_1);  
        gruops.add(title_2); 
        gruops.add(title_3);  
        gruops.add(title_4);  
        gruops.add(title_5);  
        gruops.add(title_6);  
        gruops.add(title_7);  
          
        //����������Ŀ����   
          
        //����һ   
        Map<String, String> content_11 = new HashMap<String, String>();  
        Map<String, String> content_12 = new HashMap<String, String>();  
        Map<String, String> content_13 = new HashMap<String, String>(); 
        Map<String, String> content_14 = new HashMap<String, String>(); 
        Map<String, String> content_15 = new HashMap<String, String>(); 
          
        content_11.put("child", "����ʾ����");  
        content_12.put("child", "�������");  
        content_13.put("child", "��绰������");
        content_14.put("child", "��ͨ�����ĵ绰"); 
        content_15.put("child", "���������ĵ绰"); 
          
        List<Map<String, String>> childs_1 = new ArrayList<Map<String,String>>();  
        childs_1.add(content_11);  
        childs_1.add(content_12); 
        childs_1.add(content_13);
        childs_1.add(content_14);
        childs_1.add(content_15);
        
          
        //���ݶ�   
        Map<String, String> content_21 = new HashMap<String, String>();  
        Map<String, String> content_22 = new HashMap<String, String>();  
        Map<String, String> content_23 = new HashMap<String, String>(); 
          
        content_21.put("child", "����ʾ����");  
        content_22.put("child", "��������");  
        content_23.put("child", "�����Ÿ�����");  
          
        List<Map<String, String>> childs_2 = new ArrayList<Map<String,String>>();  
        childs_2.add(content_21);  
        childs_2.add(content_22);  
        childs_2.add(content_23);  
          
        //������   
        Map<String, String> content_31 = new HashMap<String, String>();  
        Map<String, String> content_32 = new HashMap<String, String>();  
        Map<String, String> content_33 = new HashMap<String, String>(); 
          
        content_31.put("child", "����ʾ����");  
        content_32.put("child", "��UC�����");  
        content_33.put("child", "�򿪱�ǩ");  
          
        List<Map<String, String>> childs_3 = new ArrayList<Map<String,String>>();  
        childs_3.add(content_31);  
        childs_3.add(content_32);  
        childs_3.add(content_33);
        
      //������   
        Map<String, String> content_41 = new HashMap<String, String>();  
        Map<String, String> content_42 = new HashMap<String, String>();  
        Map<String, String> content_43 = new HashMap<String, String>(); 
        Map<String, String> content_44 = new HashMap<String, String>(); 
        Map<String, String> content_45 = new HashMap<String, String>(); 
          
        content_41.put("child", "����ʾ����");  
        content_42.put("child", "����������");  
        content_43.put("child", "����������");  
        content_44.put("child", "ʲô��������");  
        content_45.put("child", "��������ʲô");  
          
        List<Map<String, String>> childs_4 = new ArrayList<Map<String,String>>();  
        childs_4.add(content_41);  
        childs_4.add(content_42);  
        childs_4.add(content_43);
        childs_4.add(content_44);
        childs_4.add(content_45);
               
        //������   
        Map<String, String> content_51 = new HashMap<String, String>();  
        Map<String, String> content_52 = new HashMap<String, String>();  
        Map<String, String> content_53 = new HashMap<String, String>(); 
        Map<String, String> content_54 = new HashMap<String, String>(); 
          
        content_51.put("child", "����ʾ����");  
        content_52.put("child", "�����Ҿŵ�ʮ�ֿ���");  
        content_53.put("child", "����һ���ŵ��ӵ�����");  
        content_54.put("child", "����һ���ŵ�ʮ�ֵ�����"); 
          
        List<Map<String, String>> childs_5 = new ArrayList<Map<String,String>>();  
        childs_5.add(content_51);  
        childs_5.add(content_52);  
        childs_5.add(content_53);
        childs_5.add(content_54);
        
        //������   
        Map<String, String> content_61 = new HashMap<String, String>();  
        Map<String, String> content_62 = new HashMap<String, String>();  
        Map<String, String> content_63 = new HashMap<String, String>(); 
        Map<String, String> content_64 = new HashMap<String, String>(); 
        Map<String, String> content_65 = new HashMap<String, String>(); 
        Map<String, String> content_66 = new HashMap<String, String>(); 
        Map<String, String> content_67 = new HashMap<String, String>(); 
        
        content_61.put("child", "����ʾ����");  
        content_62.put("child", "��������");  
        content_63.put("child", "������");  
        content_64.put("child", "��������");  
        content_65.put("child", "��������");  
        content_66.put("child", "�ر�����");  
        content_67.put("child", "�ص�����");  
          
        List<Map<String, String>> childs_6 = new ArrayList<Map<String,String>>();  
        childs_6.add(content_61);  
        childs_6.add(content_62);  
        childs_6.add(content_63);
        childs_6.add(content_64);
        childs_6.add(content_65);
        childs_6.add(content_66);
        childs_6.add(content_67);
        
        //������   
        Map<String, String> content_71 = new HashMap<String, String>();  
        Map<String, String> content_72 = new HashMap<String, String>();  
        Map<String, String> content_73 = new HashMap<String, String>(); 
        Map<String, String> content_74 = new HashMap<String, String>(); 
        Map<String, String> content_75 = new HashMap<String, String>(); 
          
        content_71.put("child", "����ʾ����");  
        content_72.put("child", "���ڵ�������ô��");  
        content_73.put("child", "�����������ô��");  
        content_74.put("child", "�������ڵ�������ô��"); 
        content_75.put("child", "���������������ô��"); 
          
        List<Map<String, String>> childs_7 = new ArrayList<Map<String,String>>();  
        childs_7.add(content_71);  
        childs_7.add(content_72);  
        childs_7.add(content_73);
        childs_7.add(content_74);
        childs_7.add(content_75);
        
        
        //�������, �Ա���ʾ���б���   
        List<List<Map<String, String>>> childs = new ArrayList<List<Map<String,String>>>();  
        childs.add(childs_1);  
        childs.add(childs_2);
        childs.add(childs_3); 
        childs.add(childs_4); 
        childs.add(childs_5); 
        childs.add(childs_6); 
        childs.add(childs_7); 
        //����ExpandableList��Adapter����   
        //����: 1.������    2.һ������   3.һ����ʽ�ļ� 4. һ����Ŀ��ֵ      5.һ����ʾ�ؼ���   
        //      6. �������� 7. ������ʽ 8.������Ŀ��ֵ    9.������ʾ�ؼ���   
        SimpleExpandableListAdapter sela = new SimpleExpandableListAdapter(  
                this, gruops, R.layout.groups, new String[]{"group"}, new int[]{R.id.textGroup},   
                childs, R.layout.childs, new String[]{"child"}, new int[]{R.id.textChild}  
                );  
          
        //�����б�   
        setListAdapter(sela);  
    }  
}  