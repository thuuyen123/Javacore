/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baibuoi6;

/**
 *
 * @author Thu Uyên
 */
public class Mainch {
    public static void main(String[] args) {
//        String email = new String();
//        email = "cobangnho@gmail.com";
          String email = "cobangnho@gmail.com";
          String name = "uyen             123";
          //chiều dài của chuỗi
          System.out.println(email.length());
          //lấy từng kí tự ra 1
          System.out.println(email.charAt(4));
          //tìm chữ o nằm ở đâu
          System.out.println(email.indexOf("o"));// in ra chữ o đầu tiên mà nó nhìn thấy
          System.out.println(email.lastIndexOf("o"));//chữ o mà nó thấy cuối cùng
            //nếu kí tự đó ko xuất hiệu trong chuỗi thì nó trả về kí tự -1
          //so sánh 2 chuỗi giống hay khác nhau
          System.out.println(email.compareTo(name));//so sánh chuỗi email với chuỗi name
               // ra âm hoặc + nếu 2 chuổi khác nhau
               //bằng 0 thì giống nhau
               // có thể sử dụng cái này để sắp xếp tên theo anpa be
          System.out.println(email.toLowerCase());// chuyển chữ hoa thành chữ thường
          // giống hay ko giống dùng equals
          System.out.println(email.equals(name));
          //dùng để nối chuỗi
          System.out.println(email.concat(name));
          System.out.println(name.concat("00000"));
          //cắt chuỗi
          System.out.println(email.substring(2));//lấy từ kí tự thứ 2
          // chia nhỏ
          System.out.println(email.split("o"));
          //bỏ khoảng trắng
          System.out.println(name.trim());
    }
}
