package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFr_1 implements MinecraftAccessor {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static float[] id_case;

   private static long id_byte(long var0) {
      return Long.rotateLeft(var0, 32) ^ 948579838036317781L;
   }

   public abstract boolean id_byte();

   private static void id_int() {
      id_throws = new String[]{new String("")};
   }

   public rrFr_1() {
      this.id_extends();
      AnimValue var5 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, id_byte[0]);
      this.id_class[id_protected[1]] = var5;
      AnimValue var6 = new AnimValue(0.5F, id_byte[1]).id_package();
      this.id_class[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, id_byte[2]);
      this.id_class[2] = var7;
      AnimValue var8 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[7], 0.4F, id_byte[3]);
      this.id_class[3] = var8;
      Boolean var9 = id_byte[4];
      this.id_class[4] = var9;
      String var10 = id_throws[0];
      this.id_class[6] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 76, -28, -29, 11, -95, 69, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrZO var1) {
      this.id_break(var1);
      String var2 = this.id_implements();
      if (!var2.equals((String)this.id_class[6])) {
         this.id_class[6] = var2;
         Float var8 = 14.0F + var1.id_break(var2) + 2.5F;
         this.id_class[5] = var8;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 49873142;
   }

   public float id_class(long var1) {
      return id_case[4];
   }

   public boolean id_class(boolean var1) {
      return var1 && this.id_protected() ? true : id_byte[6];
   }

   public void id_class(float var1, float var2) {
      if (!(Boolean)this.id_class[4]) {
         ((AnimValue)this.id_class[2]).id_class(var1);
         ((AnimValue)this.id_class[3]).id_class(var2);
         Boolean var7 = true;
         this.id_class[4] = var7;
      } else {
         if (this.id_finally()) {
            ((AnimValue)this.id_class[2]).id_break(var1);
            ((AnimValue)this.id_class[3]).id_break(var2);
         } else {
            ((AnimValue)this.id_class[2]).id_class(var1);
            ((AnimValue)this.id_class[3]).id_class(var2);
         }
      }
   }

   public void id_class(boolean var1, long var2) {
      if (!((Float)this.id_class[5] <= id_case[7])) {
         boolean var4 = this.id_class(var1);
         if (this.id_break(var1)) {
            if (this.id_throws()) {
               ((AnimValue)this.id_class[id_protected[14]]).id_class(var4);
            } else {
               ((AnimValue)this.id_class[id_protected[15]]).id_class(var4 ? 1.0F : id_case[9]);
            }
         }

         ((AnimValue)this.id_class[1]).id_break((Float)this.id_class[5]);
         this.id_break(var2);
      }
   }

   public abstract rdn_3 id_class();

   public boolean id_break(boolean var1) {
      return true;
   }

   public void id_break(long var1) {
   }

   public void id_break(rrZO var1) {
   }

   public float id_break() {
      return ((AnimValue)this.id_class[2]).id_byte();
   }

   public boolean id_throws() {
      return true;
   }

   public boolean id_finally() {
      return this.id_throws();
   }

   public float id_catch() {
      return ((AnimValue)this.id_class[1]).id_byte();
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[4] = id_byte[11];
         var1[5] = id_case[10];
      }
   }

   public void id_case() {
      Boolean var5 = id_byte[10];
      this.id_class[4] = var5;
   }

   public abstract String id_implements();

   private static void id_package() {
      id_case = new float[]{0.4F, 0.5F, 0.4F, 0.4F, 0.0F, 14.0F, 2.5F, 0.0F, 1.0F, 0.0F, 0.0F};
   }

   public abstract boolean id_protected();

   public float id_private() {
      return ((AnimValue)this.id_class[3]).id_byte();
   }

   private static void id_final() {
      id_protected = new short[]{7, 0, 1, 7, 2, 7, 3, 4, 6, 1, 6, 6, 5, 5, 0, 0, 1, 5, 4, 2, 3, 4, 2, 3, 2, 3, 4, 2, 3};
   }

   private static void id_volatile() {
      id_break = new byte[]{7, 4, 5};
   }

   private static void id_native() {
      id_byte = new boolean[]{false, false, false, false, false, true, false, true, true, true, false, false};
   }
}
