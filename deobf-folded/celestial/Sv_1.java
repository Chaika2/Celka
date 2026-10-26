package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sv_1 implements MinecraftAccessor {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private boolean id_byte(String var1) {
      if (var1 != null && (String)this.id_class[2] != null) {
         return !((String)this.id_class[2]).equalsIgnoreCase(var1.toLowerCase()) ? true : id_protected[3];
      } else {
         return !Objects.equals(var1, (String)this.id_class[2]) ? true : id_protected[5];
      }
   }

   public void id_byte() {
      ((SL)this.id_class[id_byte[9]]).id_break();
      Object var5 = null;
      this.id_class[2] = var5;
      Object var6 = null;
      this.id_class[1] = var6;
      Boolean var7 = id_protected[1];
      this.id_class[3] = var7;
   }

   public Sv_1(SL var1) {
      this.id_extends();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2055049176;
   }

   public void id_class(SC var1) {
      String var6 = this.id_throws();
      this.id_class[2] = var6;
   }

   public void id_class(rrLO var1) {
   }

   public void id_class(rrFK var1) {
      this.id_byte();
   }

   public void id_class(rrAM var1) {
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -223482382786578799L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -37, -105, 63, -123, 123, 102, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      return (Boolean)this.id_class[3];
   }

   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[1]]) {
         SC var2 = this.id_case().id_catch();
         if (var2 != null) {
            String var7 = this.id_throws();
            this.id_class[1] = var7;
            if (this.id_byte((String)this.id_class[1])) {
               Boolean var8 = true;
               this.id_class[3] = var8;
            }

            if ((Boolean)this.id_class[3] && this.id_break((String)this.id_class[1])) {
               this.id_catch();
            }
         }
      }
   }

   public void id_class(rrAl_1 var1) {
   }

   public abstract boolean id_break(String var1);

   public String id_break() {
      return (String)this.id_class[1];
   }

   public abstract String id_throws();

   private static void id_finally() {
      id_protected = new boolean[]{true, false, true, false, true, false, false};
   }

   public void id_catch() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLG.id_class(((SL)this.id_class[id_byte[8]]).id_catch()));
      this.id_byte();
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[3] = id_protected[6];
      }
   }

   public SL id_case() {
      return (SL)this.id_class[id_byte[17]];
   }

   private static void id_implements() {
      id_byte = new short[]{0, 0, 1, 1, 3, 3, 1, 0, 0, 0, 2, 1, 3, 2, 2, 2, 2, 0, 1, 2, 3};
   }

   public String id_protected() {
      return (String)this.id_class[2];
   }

   private static void id_private() {
      id_break = new byte[]{4, 3};
   }
}
