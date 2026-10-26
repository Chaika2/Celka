package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SO extends Pv_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_break;

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   private void id_byte(String var1) {
      this.id_class();
      Bt_1 var2 = ((Bw_1)this.id_break[id_protected[13]]).id_class(var1);
      if (var2 != null && var2.id_case()) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[14]])
            .id_finally()
            .id_class(
               Bp_1.id_class(
                  (Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[id_protected[15]], var2, (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[1]
               )
            );
      }
   }

   public SO(C_class var1) {
      super(var1);
      this.id_class();
      SX var6 = new SX();
      this.id_break[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFv_1 var2) {
         if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[2]]) {
            return;
         }

         rgP_2 var5 = var2.id_protected();
         if (var5 == null) {
            return;
         }

         String var4 = var5.id_byte();
         switch (((int[])Sh_1.id_class[id_protected[3]])[var2.id_byte().ordinal()]) {
            case 1:
               this.id_protected(var4);
               break;
            case 2:
               this.id_byte(var4);
         }
      }
   }

   @Override
   public void id_class(rrLO var1) {
      if (var1.id_class() == null && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[5]]) {
         this.id_protected(var1.id_protected());
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1149623424;
   }

   private void id_class() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7932361412794669418L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -62, -83, -92, -45, -74, -110, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new short[]{0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
   }

   private void id_protected(String var1) {
      this.id_class();
      Bt_1 var2 = ((Bw_1)this.id_break[id_protected[6]]).id_class(var1);
      if (var2 != null) {
         rja_3 var3 = null;
         if (var2 instanceof Bn_1 var4) {
            try {
               var3 = var4.id_break(var1);
            } catch (Exception var6) {
               var6.printStackTrace();
               return;
            }

            if (var3 == null) {
               return;
            }

            var4.id_class(var3);
         }

         var2.id_throws(var1);
         if (var3 != null) {
            boolean var7 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[7]]).id_class(var3);
            var2.id_protected(((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[8]]).id_class(var2.id_throws(), var7));
            if (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_protected[9]]).id_protected(var2.id_throws()) && var7) {
               return;
            }
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[10]])
            .id_finally()
            .id_class(
               Bp_1.id_class(
                  (Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[id_protected[11]],
                  var2,
                  (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[id_protected[12]]
               )
            );
      }
   }
}
