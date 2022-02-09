import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] hocsinh={"Nam","Luong","Phong","Quoc","Tuan"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh ");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0;i< hocsinh.length;i++){
            if(hocsinh[i].equals(input_name)){
                System.out.println(" Vi tri cac hoc sinh " + input_name + " la : " + i );
                isExist=true;
                break;
            }
        }
        if(!isExist){
            System.out.println(" Khong co " + input_name + " trong danhh sach ");
        }
    }
}
