package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bx_1 extends Pv_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_break;
   private static String[] id_case;

   private static void id_byte() {
      Object[] var0 = new Object[]{new Bd_1(), Map.of(id_case[2], id_case[3]), Map.of(id_case[4], id_case[5], id_case[6], id_case[7])};
      id_break = var0;
   }

   public Bx_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLF var1) {
      if (this.id_case()) {
         rnB_2 var2 = var1.id_break();
         rgP_2 var3 = var1.id_class();
         String var4 = var3.getString();
         if (var2.id_class() == null || !var2.id_class().contains(id_case[1])) {
            if (var3.id_protected().isEmpty()) {
               for (Entry var6 : ((Map)id_break[2]).entrySet()) {
                  String var7 = (String)var6.getKey();
                  String var8 = (String)var6.getValue();
                  if (var4.equals(var7)) {
                     var4 = var4.replace(var7, var8);
                  }
               }

               var1.id_class((rgP_2)(var4.isEmpty() ? rgN_2.id_byte : new rgN_2(var4)));
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -776294426862440014L;
   }

   private static void id_class() {
      id_protected = new short[]{0, 1, 2, 1, 2, 1, 0};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 728778776;
   }

   @Override
   public void id_class(rrLv_1 var1) {
      if (this.id_case()) {
         rnB_2 var2 = var1.id_break();
         rgP_2 var3 = var1.id_class();
         String var4 = var3.getString();
         if (!var4.isEmpty() && (var2.id_class() == null || !var2.id_class().contains(id_case[0]))) {
            Object var5 = var3.id_throws();
            if (var5 instanceof rgN_2 var6) {
               String var7 = var6.id_private();

               for (Entry var9 : ((Map)id_break[id_protected[0]]).entrySet()) {
                  String var10 = (String)var9.getKey();
                  String var11 = (String)var9.getValue();
                  if (var7.contains(var10)) {
                     var7 = var7.replace(var10, var11);
                  }
               }

               var5 = new rgN_2(var7);
            }

            for (int var12 = id_throws[0]; var12 < var3.id_protected().size(); var12++) {
               rgP_2 var13 = var3.id_protected().get(var12);
               String var14 = var13.getString();
               if (!var14.isBlank() && !((Map)id_break[1]).containsKey(var14)) {
                  ((rVi_1)var5).id_class(var13);
                  ((rVi_1)var5).id_class(var13.id_class());
               }
            }

            var1.id_class((rgP_2)var5);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 6, 109, -9, -98, -45, 55, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_case = new String[]{
         new String("-"), new String("-"), new String("●"), new String(""), new String(" §e"), new String(""), new String(" §r"), new String("")
      };
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, true, false, false, true};
   }

   private boolean id_case() {
      return (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[6]]
         ? id_throws[2]
         : true;
   }

   private static void id_protected() {
      id_byte = new byte[]{2, 3};
   }
}
