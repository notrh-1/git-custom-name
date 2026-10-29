import java.util.Scanner;
class test
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入身高（米）：");
            double height = sc.nextDouble();
            System.out.println("请输入体重（千克）：");
            double weight = sc.nextDouble();
            double bmi = weight / (height * height);
            System.out.println("您的BMI值为：" + bmi);
            if (bmi < 18.5)
            {
                System.out.println("您的体重过轻");
            }
            else if (bmi < 24)
            {
                System.out.println("您的体重正常");
            }
            else if (bmi < 27)
            {
                System.out.println("您的体重过重");
            }
            else
            {
                System.out.println("您的体重肥胖");
            }
        }
        catch (Exception e)
        {
            System.out.println("输入错误，请重新输入");
        }
    }
}
