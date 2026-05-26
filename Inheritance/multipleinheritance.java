interface father {
    void showfather();

}
interface mother{
    void showmother();

}
class child implements father,mother{
    public void showfather(){
        System.out.println("this is father's side");

    }
    public void showmother(){
        System.out.println("this is mothers side");

    }

}

class multipleinheritance{
    public static void main(String[] args){
  child c = new child();
  c.showfather();
  c.showmother();

    }
}