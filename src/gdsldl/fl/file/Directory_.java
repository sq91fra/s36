package gdsldl.fl.file;

import org.junit.Test;

import java.io.File;

public class Directory_ {
//    ɾ��d:\news1.txt
    @Test
    public void m1(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("ɾ���ɹ�");
            }else {
                System.out.println("ɾ��ʧ��");
            }
        }else {
            System.out.println("���ļ�������...");
        }
    }

//�ж�d:\demo02�Ƿ���ڣ����ھ�ɾ��
//    ��java�У�Ŀ¼Ҳ�������ļ�
@Test
public void m2(){
    String filePath = "d:\\demo02";
    File file = new File(filePath);
    if (file.exists()){
        if (file.delete()){
            System.out.println("ɾ���ɹ�");
        }else {
            System.out.println("ɾ��ʧ��");
        }
    }else {
        System.out.println("��Ŀ¼������...");
    }
}

//�ж�d:\\demo\\a\\b\\c Ŀ¼�Ƿ���ڣ������ھʹ���
    @Test
    public void m3(){
        String filepath = "d:\\demo\\a\\b\\c";
        File file = new File(filepath);
        if (file.exists()){
            System.out.println(filepath+"�Ѵ���...");
        }else{
            if (file.mkdirs()){
                System.out.println(filepath+"�����ɹ�...");
            }else {
                System.out.println(filepath+"����ʧ��...");
            }
        }
    }
}
