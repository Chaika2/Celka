package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvS implements MinecraftAccessor {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;

   public float id_byte() {
      return (Float)this.id_class[2];
   }

   public rrvS(ClickGuiScreen var1) {
      this.id_throws();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1) {
      if (var1 == 0) {
         this.id_class(id_throws[1]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, -39, -113, -75, -84, 92, 53, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4603828348822030199L;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[1] = var6;
   }

   public void id_class(int var1, int var2) {
      if (this.id_break()) {
         ((ClickGuiScreen)this.id_class[id_byte[1]]).id_class((float)var1 - this.id_byte(), (float)var2 - this.id_class());
      }

      byte var3 = 5;
      float var4 = id_const.id_volatile() - 363.0F - (float)var3;
      float var5 = id_const.id_final() - 300.0F - (float)var3;
      if (var4 >= (float)var3 && var5 >= (float)var3) {
         float var6 = rfU_2.id_class((float)((ClickGuiScreen)this.id_class[id_byte[2]]).id_abstract(), (float)var3, var4);
         float var7 = rfU_2.id_class((float)((ClickGuiScreen)this.id_class[id_byte[3]]).id_finally(), (float)var3, var5);
         ((ClickGuiScreen)this.id_class[id_byte[4]]).id_class(var6, var7);
      }
   }

   public void id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!var5 || !rrtu_3.id_class(var1, var2, var3)) {
         if (var4 == 0 && ((ClickGuiScreen)this.id_class[id_byte[5]]).id_class(var2, var3)) {
            this.id_break((float)(var2 - ((ClickGuiScreen)this.id_class[id_byte[6]]).id_abstract()));
            this.id_class((float)(var3 - ((ClickGuiScreen)this.id_class[id_byte[7]]).id_finally()));
            this.id_class(true);
         }
      }
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[3] = var6;
   }

   public float id_class() {
      return (Float)this.id_class[3];
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   public boolean id_break() {
      return (Boolean)this.id_class[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704482675;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = id_throws[3];
         var1[2] = id_protected[2];
         var1[3] = id_protected[3];
      }
   }

   private static void id_catch() {
      id_break = new byte[]{5, 4, 2, 3};
   }

   private static void id_case() {
      id_throws = new boolean[]{true, false, true, false};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 2, 3};
   }

   private static void id_private() {
      id_protected = new float[]{363.0F, 300.0F, 0.0F, 0.0F};
   }
}
