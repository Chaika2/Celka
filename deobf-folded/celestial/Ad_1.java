package celestial;

import com.mojang.datafixers.util.Pair;
import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class Ad_1 {
   private final String id_class;
   private final int id_break;

   private Ad_1(String var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   private static int id_class(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }

   public static Ad_1 id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1 = var0.split(":");
         if (var0.startsWith("[")) {
            int var2 = var0.indexOf("]");
            if (var2 > 0) {
               String var3 = var0.substring(1, var2);
               String var4 = var0.substring(var2 + 1).trim();
               if (var4.startsWith(":") && !var4.isEmpty()) {
                  var4 = var4.substring(1);
                  var1 = new String[]{var3, var4};
               } else {
                  var1 = new String[]{var3};
               }
            }
         }

         if (var1.length > 2) {
            var1 = new String[]{var0};
         }

         String var5 = var1[0];
         int var6 = var1.length > 1 ? id_class(var1[1], 25565) : 25565;
         if (var6 == 25565) {
            Pair var8 = id_break(var5);
            var5 = (String)var8.getFirst();
            var6 = (Integer)var8.getSecond();
         }

         return new Ad_1(var5, var6);
      }
   }

   public String id_class() {
      try {
         return IDN.toASCII(this.id_class);
      } catch (IllegalArgumentException var2) {
         return "";
      }
   }

   private static Pair<String, Integer> id_break(String var0) {
      try {
         String var1 = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable var2 = new Hashtable();
         var2.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var2.put("java.naming.provider.url", "dns:");
         var2.put("com.sun.jndi.dns.timeout.retries", "1");
         InitialDirContext var3 = new InitialDirContext(var2);
         Attributes var4 = var3.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
         Attribute var5 = var4.get("srv");
         if (var5 != null) {
            String[] var6 = var5.get().toString().split(" ", 4);
            return Pair.of(var6[3], id_class(var6[2], 25565));
         }
      } catch (Throwable var7) {
      }

      return Pair.of(var0, 25565);
   }

   public int id_break() {
      return this.id_break;
   }
}
