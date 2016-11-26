import java.io.*;

public class Certification {
    //Нормативні значення
    static float Ncgf;
    static float Ncgk;
    static float Ncgp;
    static float Ncgvp;
    //Бізнес-процеси
    static float Wmvp;
    static float Vm;
    static float Vzag;
    static float Wg;
    static float Nr;
    static float Nzag;
    static float Wv;
    static float Ae;
    static float Asp;
    static float Cgvp;
    //Клієнти
    static float Wzp;
    static float Nsp;
    static float Np;
    static float Wst;
    static float Zr;
    static float Pr;
    static float Wkp;
    static float Nkv;
    static float Cgp;
    //Персонал
    static float Woch;
    static float Toch;
    static float Tdop;
    static float Wy;
    static float Arp;
    static float Am;
    static float Wtoi;
    static float Tfi;
    static float Tni;
    static float Wr;
    static float nr;
    static float Aobs;
    static float Wvp;
    static float Vi;
    static float Vik;
    static float nCk;
    static float Cgk;
    //Фінанси
    static float Wn;
    static float Kv;
    static float Ka;
    static float Wvoz;
    static float Voz;
    static float A;
    static float Vmzag;
    static float Wrp;
    static float P;
    static float Vp;
    static float Cgf;
    // Резерв
    static float Tnp;
    static float Tnrez;
    static float Tasp;


    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        readNorms();
        print();
        compare(Cgvp,Ncgvp,"внутрiшнi бiзнес - процеси");
        compare(Cgp,Ncgp,"персонал");
        compare(Cgk,Ncgk,"клiєнти");
        compare(Cgf,Ncgf,"фiнанси");

    }
    public static void print() {
        System.out.println("І. Етап ідентифікації потенційних базових підприємств");
        System.out.println("1.Проведення прикладного дослідження, шляхом опитування представників ПАТ" +
                " щодо визначення фактичних значень оціночних показників підприєиств, шо надають послуги ТО та Р АТЗ");
        System.out.println("2.Визначення підприємств, на ВТБ  яких може здійснюватись ТО та Р АТЗ ПАТ-партнерів");
        if (countRez()>0){
            System.out.println("3.Tnp+Tnrez-Tasp>0");
            System.out.println("4.Проведення переговорів з керівництвом потенційних базових підприємств щодо здійснення на їх потужностях робіт з ТО та Р АТЗ ПАТ-партнерів");
            System.out.println("ІІ.Етап визначення нормативних показників для зіставлення з фактичними значеннями показників підприємств");
            System.out.println("5.Визначення якісного та кількісного складу експертної групи");
            System.out.println("6.Формування експертної групи");
            System.out.println("7.Проведення прикладного дослідження, шляхом опитування експертів щодо визначення нормативних значень оціночних показників");
            System.out.println("8.Розрахунок комплексних та нормативних оціночних показників");
            System.out.println("ІІІ.Етап визначення суб'єктів сертифікації");
            System.out.println("9.Подача органом сертифiкацii пропозицii проходження сертифiкацii потенцiйному ПАТ-лiдеру.");
            System.out.println("10.Керiвництво пiдприємства погоджується на сертифiкацiю?(Y/N)");
            String result = null;
            try {
                result = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (result.equals("N")) {
                System.out.println("Ви не отримаєте сертифікат");
            } else {
                System.out.println("11.Подача запиту на проведення сертифiкацiї в орган сертифікацiї");
                System.out.println("12.Розгляд запиту органом сертифiкацiї");
                System.out.println("13.Формування експертної комiсiї для проведення сертифiкацiї");
                System.out.println("IV. Етап визначення відповідності підприємств умовам сертифікації");
                System.out.println("14.Зiставлення якiсних показникiв дiяльностi ПАТ, що надають послуги з ТО та ПР паркiв ТЗ");
                countCgvp();
                countCgk();
                countCgf();
                countCgp();

            }
        }
        else
            System.out.println("Здійснюється пошук підприємств, на ВТБ  яких може здійснюватись ТО та Р АТЗ ПАТ-партнерів");
        }

    public static float countRez(){
        try {
            System.out.println("Введіть Tnp");
            Tnp = Float.parseFloat(reader.readLine());
            System.out.println("Введіть Tnrez");
            Tnrez = Float.parseFloat(reader.readLine());
            System.out.println("Введіть Tasp");
            Tasp = Float.parseFloat(reader.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return Tnp+Tnrez-Tasp;
    }
    public static void countCgvp() {
        System.out.println("15. Зіставлення комплексного показника \"Внутрішні бізнес-процеси\" Cgvp>NCgvp");
        try {
            System.out.println("Введiть Wmvp >");
            Wmvp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vm >");
            Vm = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vzag >");
            Vzag = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wg >");
            Wg = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Nr >");
            Nr = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Nzag >");
            Nzag = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wv >");
            Wv = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Ae >");
            Ae = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Asp >");
            Asp = Float.parseFloat(reader.readLine());
            Cgvp = round(Wmvp * (Vm/Vzag) + Wg * (Nr/Nzag) + Wv * (Ae/Asp),3);
            System.out.println("Cgvp = Wmvp * (Vm/Vzag) + Wg * (Nr/Nzag) + Wv * (Ae/Asp)= " + Cgvp);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static void countCgp(){
        System.out.println("21. Зіставлення комплексного показника \"Персонал\" Cgp>NCgp");
        try {
            System.out.println("Введiть Wzp >");
            Wzp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Nsp >");
            Nsp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Np>");
            Np = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wst >");
            Wst = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Zr >");
            Zr = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Pr >");
            Pr = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wkp >");
            Wkp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Nkv >");
            Nkv = Float.parseFloat(reader.readLine());
            Cgp = round(Wzp * (Nsp/Np) + Wst * (1-(Zr/(Nsp+Pr))) + Wkp * (Nkv/Nsp),3);
            System.out.println(" Cgp = Wzp * (Nsp/Np) + Wst * (1-(Zr/(Nsp+Pr))) + Wkp * (Nkv/Nsp)= " + Cgp+";");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void countCgk(){
        System.out.println("17. Зіставлення комплексного показника \"Клієнти\" Cgk>NCgk");
        try {
            System.out.println("Введiть Woch >");
            Woch = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Toch >");
            Toch = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Tdop >");
            Tdop = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wy >");
            Wy = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Arp >");
            Arp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Am >");
            Am = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wtoi >");
            Wtoi = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Tfi >");
            Tfi = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Tni >");
            Tni = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wr >");
            Wr = Float.parseFloat(reader.readLine());
            System.out.println("Введiть nr >");
            nr = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Aobs >");
            Aobs = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wvp >");
            Wvp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vi >");
            Vi = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vik >");
            Vik = Float.parseFloat(reader.readLine());
            System.out.println("Введiть nCk >");
            nCk = Float.parseFloat(reader.readLine());
            Cgk = round(((1-Woch*(Toch/Tdop))+(1-Wy*(Arp/Am))+(1-Wtoi*(Tfi/Tni))+(1-Wr*(nr/Aobs))+(1-Wvp*(Vi/Vik)))/nCk,3);
            System.out.println("Cgk = ((1-Woch*(Toch/Tdop))+(1-Wy*(Arp/Am))+(1-Wtoi*(Tfi/Tni))+(1-Wr*(nr/Aobs))+(1-Wvp*(Vi/Vik)))/nCk = " + Cgk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void countCgf(){
        System.out.println("19. Зіставлення комплексного показники \"Фінанси\" Cgf>NCgf");
        try {
            System.out.println("Введiть Wn >");
            Wn = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Kv >");
            Kv = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Ka >");
            Ka = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wvoz >");
            Wvoz = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Voz >");
            Voz = Float.parseFloat(reader.readLine());
            System.out.println("Введiть A >");
            A = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vmzag >");
            Vmzag = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Wrp >");
            Wrp = Float.parseFloat(reader.readLine());
            System.out.println("Введiть P >");
            P = Float.parseFloat(reader.readLine());
            System.out.println("Введiть Vp >");
            Vp = Float.parseFloat(reader.readLine());
            Cgf = round(Wn * (Kv/Ka) + Wvoz * ((Voz-A)/Vmzag) + Wrp * (P/Vp),3);
            System.out.println("Cgf = Wn * (Kv/Ka) + Wvoz * ((Voz-A)/Vmzag) + Wrp * (P/Vp) = " + Cgf);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    private static float round(float number, int scale) {
        int pow = (int) Math.pow(10, scale);
        float tmp = number * pow;
        return (float) (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) / pow;
    }
    private static void readNorms(){
        String linkNcgf = "D:\\Norms\\Ncgf.txt";
        String linkNcgk = "D:\\Norms\\Ncgk.txt";
        String linkNcgp = "D:\\Norms\\Ncgp.txt";
        String linkNcgvp = "D:\\Norms\\Ncgvp.txt";
        try {
            BufferedReader readNcgf = new BufferedReader(new FileReader(new File(linkNcgf)));
            BufferedReader readNcgk = new BufferedReader(new FileReader(new File(linkNcgk)));
            BufferedReader readNcgp = new BufferedReader(new FileReader(new File(linkNcgp)));
            BufferedReader readNcgvp = new BufferedReader(new FileReader(new File(linkNcgvp)));
            Ncgf = Float.parseFloat(readNcgf.readLine());
            Ncgk = Float.parseFloat(readNcgk.readLine());
            Ncgp = Float.parseFloat(readNcgp.readLine());
            Ncgvp = Float.parseFloat(readNcgvp.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void compare(float C, float N, String n){
        if (C<N){
            float r =round(N-C,3);
            System.out.println("Значення комплексного показника \""
                    + n + "\" вашого пiдприємства " + C + " нормативне значення " + N +
                    ". Отже, рiвень вашого пiдприємства за даним комплексним показником не задовольняє вимогам сертифiкацiї. Вам необхiдно привести комплексний показник \""
                    +n+"\" у вiдповiднiсть до нормативного, збiльшивши його рiвень  на "+r);
        }
        else
            System.out.println("Значення комплексного показника \""
                    + n + "\" вашого пiдприємства " +C +
                    " нормативне значення " + N+". Отже, рiвень вашого пiдприємства задовольняє вимогам сертифiкацiї.");
    }
}
