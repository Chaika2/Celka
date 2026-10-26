package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SH extends Sv_1 {
   public Object[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, 2, 101, -7, 71, 0, -111, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_byte() {
      this.id_finally();
      super.id_byte();
      Boolean var5 = id_protected[1];
      this.id_break[id_throws[0]] = var5;
      Integer var6 = Integer.valueOf(id_protected[2]);
      this.id_break[1] = var6;
   }

   public SH(SL var1) {
      super(var1);
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5444140911029213933L;
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_finally();
      super.id_class(var1);
      SL var2 = this.id_case();
      SC var3 = var2.id_catch();
      if (var3 != null) {
         Boolean var8 = true;
         this.id_break[id_throws[2]] = var8;
         this.id_case().id_class();
      }
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_finally();
      super.id_class(var1);
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[3]]) {
         SL var2 = this.id_case();
         SC var3 = var2.id_catch();
         if (var3 == null || !(Boolean)this.id_break[id_throws[4]]) {
            return;
         }

         int var4 = (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] ? id_protected[4] : 17;
         if (var3 instanceof Sl_1 var5) {
            int var6 = var5.id_break();
            if (var6 > 0) {
               var4 = var6;
            }
         }

         int var10002 = (Integer)this.id_break[1] + 1;
         Integer var11 = var10002;
         this.id_break[1] = var11;
         if (var10002 >= var4 && !C_throws.id_byte().id_try().id_class(true)) {
            ((cb_3)id_import.id_class[57]).id_case("/" + var3.id_byte());
            Integer var12 = -10;
            this.id_break[1] = var12;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1456044445;
   }

   @Override
   public boolean id_break(String var1) {
      PI var2 = PI.id_break(var1);
      if (var2 != null) {
         Pf_1 var3 = var2.id_class();
         if (var3 != null) {
            return var3.id_break();
         }
      }

      return id_protected[0];
   }

   @Override
   public String id_throws() {
      PI var1 = C_throws.id_byte().id_native().id_protected();
      if (var1 != null) {
         Pf_1 var2 = var1.id_class();
         if (var2 != null) {
            return var2.id_class() + var1.id_break();
         }
      }

      return null;
   }

   private void id_finally() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[id_protected[7]] = id_protected[8];
         var1[1] = Integer.valueOf(id_protected[10]);
      }
   }

   private static void id_extends() {
      id_protected = new boolean[]{false, false, false, true, false, true, true, false, false, true, false};
   }

   private static void id_implements() {
      id_throws = new short[]{0, 1, 0, 0, 0, 1, 4, 1, 1, 57, 1};
   }

   private static void id_private() {
      id_byte = new byte[]{17, -10, 2};
   }
}
