package celestial;

import celestial.module.combat.AttackAura;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCP extends rrnK_2 {
   private static boolean[] id_protected;
   private static short[] id_case;
   public Object[] id_byte;
   private static float[] id_catch;
   private static byte[] id_private;

   public float id_byte() {
      return -1.0F;
   }

   public float id_int() {
      return -1.0F;
   }

   public rrCP(AttackAura var1) {
      super(var1, new rrTT(var1));
      this.id_else();
      Boolean var6 = true;
      this.id_byte[0] = var6;
      rrCB var7 = new rrCB(this);
      this.id_byte[1] = var7;
      this.id_class(true);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new short[]{0, 1, 0, 0, 0, 1, 0, 0, 57, 15, 0, 57, 16, 0, 1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4812986788951713981L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1531096384;
   }

   public float id_class(rjU_2 var1, rjU_2 var2) {
      this.id_else();
      return (Boolean)this.id_byte[0] ? (Float)((cb_3)id_import.id_class[57]).id_throws[15] : super.id_class(var1, var2);
   }

   public void id_class(q_1 var1) {
      this.id_else();
      super.id_class(var1);
      AttackAura var2 = (AttackAura)this.id_continue();
      rrnD_2 var3 = var2.id_long();
      iB_2 var4 = var2.id_continue();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (var3.id_class(var2)) {
            Boolean var9 = false;
            this.id_byte[0] = var9;
            this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.id_class(var4);
         } else {
            Boolean var10 = true;
            this.id_byte[0] = var10;
         }
      }

      var3.id_class(var2, var1);
   }

   public float id_break(rjU_2 var1, rjU_2 var2) {
      this.id_else();
      return (Boolean)this.id_byte[0] ? (Float)((cb_3)id_import.id_class[57]).id_throws[16] : super.id_break(var1, var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -105, -58, -70, 79, 59, 68, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_synchronized();
      id_this();
      id_return();
      id_public();
   }

   private void id_else() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         this.id_byte[0] = false;
      }

   }

   private static void id_return() {
      id_catch = new float[]{-1.0F, -1.0F};
   }

   private static void id_public() {
      id_private = new byte[]{2};
   }

   public rrTf_1 id_protected() {
      this.id_else();
      return (rrTf_1)this.id_byte[1];
   }

   public void id_volatile() {
      this.id_else();
      super.id_volatile();
      Boolean var5 = true;
      this.id_byte[0] = var5;
   }

   private static void id_synchronized() {
      id_protected = new boolean[]{true, true, false, true, true, false, false};
   }
}
