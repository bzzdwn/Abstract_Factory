public class Factory_Creator {
    public Factory CreateFactory(Object system){
        if (system.equals(Systems.IOS)){
            return new IOS_Factory();
        }
        else if (system.equals(Systems.ANDROID)){
            return new Android_Factory();
        }
        else return null;
    }
}
