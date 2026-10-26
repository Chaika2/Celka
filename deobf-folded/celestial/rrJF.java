package celestial;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

public class rrJF {
   private String id_case = null;
   private int id_catch = 0;
   private Proxy id_private = Proxy.NO_PROXY;
   private String id_implements = null;
   private String id_finally = null;
   private String id_extends = null;
   private Map<String, String> id_native = new LinkedHashMap<>();
   private byte[] id_volatile = null;
   private int id_final = 0;
   public static final String id_class = "GET";
   public static final String id_break = "HEAD";
   public static final String id_byte = "POST";
   public static final String id_protected = "HTTP/1.0";
   public static final String id_throws = "HTTP/1.1";

   public String id_byte() {
      return this.id_implements;
   }

   public rrJF(String var1, int var2, Proxy var3, String var4, String var5, String var6, Map<String, String> var7, byte[] var8) {
      this.id_case = var1;
      this.id_catch = var2;
      this.id_private = var3;
      this.id_implements = var4;
      this.id_finally = var5;
      this.id_extends = var6;
      this.id_native = var7;
      this.id_volatile = var8;
   }

   public void id_class(int var1) {
      this.id_final = var1;
   }

   public String id_class() {
      return this.id_case;
   }

   public int id_break() {
      return this.id_catch;
   }

   public String id_throws() {
      return this.id_extends;
   }

   public byte[] id_catch() {
      return this.id_volatile;
   }

   public Map<String, String> id_case() {
      return this.id_native;
   }

   public Proxy id_implements() {
      return this.id_private;
   }

   public String id_protected() {
      return this.id_finally;
   }

   public int id_private() {
      return this.id_final;
   }
}
