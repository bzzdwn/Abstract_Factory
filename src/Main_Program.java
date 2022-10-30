public class Main_Program {
    public static void main(String[] args) {
        Factory factory = new Factory_Creator().CreateFactory(Systems.ANDROID);
        factory.CreateVersion(Android_Versions.FIRST).SuperAction();
    }
}
