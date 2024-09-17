public class exe13 {
    public static void main(String[] args) {
        
        int num1 = 8;
        int num2 = 22;
        int num3 = 14;
        int num4 = 7;

        int maior1, maior2, maior3, menor;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            maior1 = num1;
            if (num2 > num3 && num2 > num4) {
                maior2 = num2;
                if (num3 > num4) {
                    maior3 = num3;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num3;
                }
            } else if (num3 > num2 && num3 > num4) {
                maior2 = num3;
                if (num2 > num4) {
                    maior3 = num2;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num2;
                }
            } else {
                maior2 = num4;
                if (num2 > num3) {
                    maior3 = num2;
                    menor = num3;
                } else {
                    maior3 = num3;
                    menor = num2;
                }
            }
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            maior1 = num2;
            if (num1 > num3 && num1 > num4) {
                maior2 = num1;
                if (num3 > num4) {
                    maior3 = num3;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num3;
                }
            } else if (num3 > num1 && num3 > num4) {
                maior2 = num3;
                if (num1 > num4) {
                    maior3 = num1;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num1;
                }
            } else {
                maior2 = num4;
                if (num1 > num3) {
                    maior3 = num1;
                    menor = num3;
                } else {
                    maior3 = num3;
                    menor = num1;
                }
            }
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            maior1 = num3;
            if (num1 > num2 && num1 > num4) {
                maior2 = num1;
                if (num2 > num4) {
                    maior3 = num2;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num2;
                }
            } else if (num2 > num1 && num2 > num4) {
                maior2 = num2;
                if (num1 > num4) {
                    maior3 = num1;
                    menor = num4;
                } else {
                    maior3 = num4;
                    menor = num1;
                }
            } else {
                maior2 = num4;
                if (num1 > num2) {
                    maior3 = num1;
                    menor = num2;
                } else {
                    maior3 = num2;
                    menor = num1;
                }
            }
        } else {
            maior1 = num4;
            if (num1 > num2 && num1 > num3) {
                maior2 = num1;
                if (num2 > num3) {
                    maior3 = num2;
                    menor = num3;
                } else {
                    maior3 = num3;
                    menor = num2;
                }
            } else if (num2 > num1 && num2 > num3) {
                maior2 = num2;
                if (num1 > num3) {
                    maior3 = num1;
                    menor = num3;
                } else {
                    maior3 = num3;
                    menor = num1;
                }
            } else {
                maior2 = num3;
                if (num1 > num2) {
                    maior3 = num1;
                    menor = num2;
                } else {
                    maior3 = num2;
                    menor = num1;
                }
            }
        }
        System.out.println("Números em ordem decrescente:");
        System.out.println(maior1 + " " + maior2 + " " + maior3 + " " + menor);
    }
} 


