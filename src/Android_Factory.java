public class Android_Factory extends Factory{
    Android_Factory(){
    }
    @Override
    Operation_System CreateVersion(Object version) {
        if (version.equals(Android_Versions.FIRST)){
            return new Android_1();
        }
        else if (version.equals(Android_Versions.SECOND)){
            return new Android_2();
        }
        else if (version.equals(Android_Versions.THIRD)){
            return new Android_3();
        }
        else return null;
    }
}
