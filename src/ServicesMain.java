/*
 Класс main.
 */
public class ServicesMain {
    public static void main(String[] args){
        Tenant tenant = new Tenant("wasy",32);
        Request request = new Request("electric",36,23);
        Brigada brigada = new Brigada("electric",23);
        int hashRequest;
        int hashDispatcher;
        int hashTenant;
        int hashBrigade;
        hashTenant = tenant.hashCode();
        hashRequest = request.hashCode();
        hashBrigade = brigada.hashCode();
    }
}
