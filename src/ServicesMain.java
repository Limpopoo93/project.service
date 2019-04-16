/*
 Класс main.
 */
public class ServicesMain {
    public static void main(String[] args){
        Tenant tenant = new Tenant("wasy",32);
        Tenant tenant2 = new Tenant("wasy",32);
        Request request = new Request("electric",36,23);
        Brigada brigada = new Brigada("electric",23);
        System.out.println(String.valueOf(tenant.equals(tenant2)));
        System.out.println(tenant.hashCode());
        System.out.println(String.valueOf(request.hashCode()));
        System.out.println(String.valueOf(brigada.hashCode()));
    }
}
