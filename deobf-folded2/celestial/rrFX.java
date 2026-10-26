package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFX {
   private static boolean[] id_break;
   public Object[] id_class;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static String[] id_case;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 810784379;
   }

   public rdn_3 id_byte() {
      return (rdn_3)this.id_class[1];
   }

   public rrFX(iB_2 var1, rdn_3 var2) {
      this.id_finally();
      AnimValue var7 = new AnimValue(0.5F, false);
      this.id_class[4] = var7;
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      Integer var10 = var2.id_char();
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrFX var2 = (rrFX)var1;
         return Objects.equals((iB_2)this.id_class[0], (iB_2)var2.id_class[0])
               && Objects.equals(((rdn_3)this.id_class[1]).id_continue().getString(), ((rdn_3)var2.id_class[1]).id_continue().getString())
            ? true
            : id_break[7];
      } else {
         return id_break[5];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((iB_2)this.id_class[0], ((rdn_3)this.id_class[1]).id_continue().getString());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4366967478381526679L;
   }

   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[4]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, 125, 60, 50, 118, 32, -99, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[2] = var6;
   }

   public iB_2 id_class() {
      return (iB_2)this.id_class[0];
   }

   public int id_break() {
      return (Integer)this.id_class[3];
   }

   public void id_break(int var1) {
      Integer var6 = var1;
      this.id_class[3] = var6;
   }

   public rVi_1 id_throws() {
      rgN_2 var1 = new rgN_2("");
      var1.id_class(((iB_2)this.id_class[0]).id_class(new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME}))
         .id_break(rgF_2.GRAY + " » ")
         .id_class(((rdn_3)this.id_class[1]).id_continue());
      if ((Integer)this.id_class[2] > 1) {
         var1.id_break(rgF_2.RED + " x" + (Integer)this.id_class[2]);
      }

      return var1;
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[2] = 0;
         var1[3] = 0;
      }
   }

   private static void id_catch() {
      id_break = new boolean[]{false, false, true, true, true, false, true, false, false, true, false, false};
   }

   private static void id_extends() {
      id_throws = new short[]{4, 0, 1, 2, 4, 0, 1, 2, 2, 0, 0, 1, 1, 0, 1, 0, 1, 2, 3, 4, 2, 3};
   }

   public int id_case() {
      return (Integer)this.id_class[2];
   }

   private static void id_implements() {
      id_protected = new byte[]{2, 2, 5, 2, 3};
   }

   public AnimValue id_protected() {
      return (AnimValue)this.id_class[4];
   }

   private static void id_private() {
      id_case = new String[]{new String("")};
   }

   private static void id_native() {
      id_byte = new float[]{0.5F};
   }
}
