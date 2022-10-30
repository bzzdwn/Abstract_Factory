public class IOS_Factory extends Factory{
    IOS_Factory(){

    }
    @Override
    Operation_System CreateVersion(Object version) {
        if (version.equals(IOS_Versions.FIRST)){
            return new IOS_1();
        }
        else if (version.equals(IOS_Versions.SECOND)){
            return new IOS_2();
        }
        else if (version.equals(IOS_Versions.THIRD)){
            return new IOS_3();
        }
        else if (version.equals(IOS_Versions.FOURTH)){
            return new IOS_4();
        }
        else if (version.equals(IOS_Versions.FIFTH)){
            return new IOS_5();
        }
        else return null;
    }
}

