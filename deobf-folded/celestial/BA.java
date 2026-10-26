package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BA extends Pv_1 {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[id_byte[7]] = id_byte[8];
      }
   }

   public BA(C_class var1) {
      super(var1);
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public boolean id_class() {
      this.id_byte();
      return (Boolean)this.id_break[id_protected[1]];
   }

   @Override
   public void id_class(rrLU var1) {
      super.id_class(var1);
      if (var1.id_class() instanceof Fu_1 var2) {
         rJr_1 var4 = var2.G_();
         if (var4.id_case != 0 && !(var4 instanceof rXi_1)) {
            this.id_class(true);
         }
      }
   }

   @Override
   public void id_class(rrFo_1 var1) {
      super.id_class(var1);
      if (var1.id_break() instanceof Fu_1) {
         this.id_class(id_byte[4]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -345971107;
   }

   private void id_class(boolean var1) {
      this.id_byte();
      Boolean var6 = var1;
      this.id_break[id_protected[2]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -530730696724975923L;
   }

   @Override
   public void id_class(rrAM var1) {
      super.id_class(var1);
      this.id_class(id_byte[5]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 92, -71, -121, -64, 81, 50, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(y_1 var1) {
      super.id_break(var1);
      if (var1.id_byte() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[0]]) {
         ruS_2 var2 = var1.id_protected();
         if (var2 instanceof rmt_3) {
            this.id_class(true);
         } else if (var2 instanceof rmD_2 var3) {
            if (var3.id_break() == rmU_2.OPEN_INVENTORY) {
               this.id_class(true);
            }
         } else if (var2 instanceof rmj_3) {
            this.id_class(id_byte[2]);
         }
      }
   }

   private static void id_break() {
      id_protected = new short[3];
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, true, false, true, false, false, true, false, false};
   }
}
