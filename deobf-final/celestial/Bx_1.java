package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bx_1 extends Pv_1 {
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   public static Object[] break_;
   private static String[] case_;

   private static void byte_() {
      Object[] var0 = new Object[]{new Bd_1(), Map.of("●", ""), Map.of(" §e", "", " §r", "")};
      break_ = var0;
   }

   public Bx_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLF var1) {
      if (this.case_()) {
         rnB_2 var2 = var1.break_();
         rgP_2 var3 = var1.class_();
         String var4 = var3.getString();
         if (var2.class_() == null || !var2.class_().contains("-")) {
            if (var3.protected_().isEmpty()) {
               for (Entry var6 : ((Map)break_[2]).entrySet()) {
                  String var7 = (String)var6.getKey();
                  String var8 = (String)var6.getValue();
                  if (var4.equals(var7)) {
                     var4 = var4.replace(var7, var8);
                  }
               }

               var1.class_((rgP_2)(var4.isEmpty() ? rgN_2.byte_ : new rgN_2(var4)));
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -776294426862440014L;
   }

   private static void class_() {
      protected_ = new short[]{0, 1, 2, 1, 2, 1, 0};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 728778776;
   }

   @Override
   public void class_(rrLv_1 var1) {
      if (this.case_()) {
         rnB_2 var2 = var1.break_();
         rgP_2 var3 = var1.class_();
         String var4 = var3.getString();
         if (!var4.isEmpty() && (var2.class_() == null || !var2.class_().contains("-"))) {
            Object var5 = var3.throws_();
            if (var5 instanceof rgN_2 var6) {
               String var7 = var6.private_();

               for (Entry var9 : ((Map)break_[0]).entrySet()) {
                  String var10 = (String)var9.getKey();
                  String var11 = (String)var9.getValue();
                  if (var7.contains(var10)) {
                     var7 = var7.replace(var10, var11);
                  }
               }

               var5 = new rgN_2(var7);
            }

            for (int var12 = throws_[0]; var12 < var3.protected_().size(); var12++) {
               rgP_2 var13 = var3.protected_().get(var12);
               String var14 = var13.getString();
               if (!var14.isBlank() && !((Map)break_[1]).containsKey(var14)) {
                  ((rVi_1)var5).class_(var13);
                  ((rVi_1)var5).class_(var13.class_());
               }
            }

            var1.class_((rgP_2)var5);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 6, 109, -9, -98, -45, 55, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      case_ = new String[]{
         new String("-"), new String("-"), new String("●"), new String(""), new String(" §e"), new String(""), new String(" §r"), new String("")
      };
   }

   private static void throws_() {
      throws_ = new boolean[]{false, true, false, false, true};
   }

   private boolean case_() {
      return (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
         ? throws_[2]
         : throws_[1];
   }

   private static void protected_() {
      byte_ = new byte[]{2, 3};
   }
}
