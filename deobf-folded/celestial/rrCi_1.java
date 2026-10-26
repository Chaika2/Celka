package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCi_1 extends rrTF<NoSlow> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = 0;
      }
   }

   public rrCi_1(NoSlow var1) {
      super(var1);
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_byte();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) {
         if (((cb_3)id_import.id_class[57]).id_return()) {
            Integer var6 = (Integer)this.id_class[id_byte[2]] + 1;
            this.id_class[id_byte[3]] = var6;
         } else {
            Integer var7 = Integer.valueOf(id_break[1]);
            this.id_class[id_byte[4]] = var7;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1494124884;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 37, -60, -5, -61, 34, 56, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_byte();
      rdn_3 var2 = var1.id_catch();
      if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         || !var1.id_class(rdy_3.hp) && !var1.id_class(rdy_3.hy)
         || rrjS_2.id_protected()) {
         if ((Integer)this.id_class[id_byte[7]] > 1 && ((cb_3)id_import.id_class[57]).Sw() > 1) {
            var1.id_class(true);
            Integer var7 = Integer.valueOf(id_break[5]);
            this.id_class[id_byte[9]] = var7;
         }
      }
   }

   private static void id_class() {
      id_byte = new short[]{0, 57, 0, 0, 0, 1, 4, 0, 57, 0, 0};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3775181783992640341L;
   }

   private static void id_break() {
      id_break = new boolean[]{true, false, true, true, true, false, false, true, false, false};
   }

   @Override
   public boolean aK_() {
      this.id_byte();
      Integer var5 = Integer.valueOf(id_break[6]);
      this.id_class[id_byte[10]] = var5;
      return super.aK_();
   }
}
