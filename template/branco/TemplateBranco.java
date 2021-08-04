/*
 */package template.branco;

/**Lucas TB
 *
 * @author lucas.souza13
 */
public class TemplateBranco {

    /**Lucas TB
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = " Olá Mundo \n";
int[] ListNum = {1, 2, 3, 4};
int resp = 5;
        System.out.print(str1);
        if(ListNum[0] + ListNum[1] == resp){
            System.out.printf(" %d + ", ListNum[0]);
            System.out.printf(" %d = ", ListNum[1]);
            System.out.printf(" %d \n",  resp);
        } 
        if(ListNum[0] + ListNum[2] == resp){
            System.out.printf(" %d + ", ListNum[0]);
            System.out.printf(" %d = ", ListNum[2]);
            System.out.printf(" %d \n",  resp);
        }
        if(ListNum[0] + ListNum[3] == resp){
            System.out.printf(" %d +", ListNum[0]);
            System.out.printf(" %d = ", ListNum[3]);
            System.out.printf(" %d \n", resp);
        }
        if(ListNum[1] + ListNum[2] == resp){
            System.out.printf(" %d +", ListNum[1]);
            System.out.printf(" %d = ", ListNum[2]);
            System.out.printf(" %d \n",  resp);
        } 
     else {
             System.out.print("Resposta errada");
             }
        }}
        
