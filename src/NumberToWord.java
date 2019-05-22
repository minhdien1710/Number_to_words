import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        String[] word = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        number = scanner.nextInt();
        String convert;
        String s = Integer.toString(number);
        String[] arr = s.split("");

        if (s.length() == 1) {
            convert = word[number];
            System.out.println(convert);
        } else if (s.length() == 2) {
            int hangChuc = Integer.parseInt(arr[0]);
            int donVi = Integer.parseInt(arr[1]);
            if (hangChuc == 1) {
                convert = "Mười " + word[donVi];
                if (donVi == 5) {
                    convert = "Mười lăm";
                }
            } else if(donVi == 4){
                convert = word[hangChuc] + " mươi tư" ;
            }else if (donVi == 5){
                convert = word[hangChuc] + " mươi lăm";
            }else {
                convert = word[hangChuc] + "mươi" + word[donVi];
            }
            System.out.println(convert);
        } else if (s.length() == 3) {
            int hangTram = Integer.parseInt(arr[0]);
            int hangChuc = Integer.parseInt(arr[1]);
            int donVi = Integer.parseInt(arr[2]);
            if(hangChuc== 0){
                if(donVi ==0){
                    convert = word[hangTram] + " trăm";
                }else {
                    convert = word[hangTram] + " trăm linh " + word[donVi];
                }
            }
            else if (hangChuc == 1) {
                convert = word[hangTram] + " trăm mười " + word[donVi];
            }
            else  if (donVi== 5) {
                convert = word[hangTram] + " trăm " + word[hangChuc] + " mươi lăm";
            }else {
                convert = word[hangTram] + " trăm " + word[hangChuc] + " mươi " + word[donVi];

            }
            System.out.println(convert);

        }


    }
}
