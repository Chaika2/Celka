package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryB {
   private static float[] id_class;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;
   public Object[] id_break;

   public abstract rfl_3 id_byte();

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[1] = 0L;
         this.id_break[2] = 0;
         this.id_break[3] = 0.0F;
         this.id_break[4] = false;
         this.id_break[5] = false;
      }
   }

   public rryB() {
      this.id_int();
      UUID var5 = UUID.randomUUID();
      this.id_break[0] = var5;
      Long var6 = rqR_2.id_break();
      this.id_break[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3], 1.0F, false);
      this.id_break[6] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4374535982436740689L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 161311662;
   }

   public abstract rjU_2 id_class();

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[5] = var6;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, 20, 30, 30, 44, 114, 8, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract rdn_3 id_break();

   public abstract long id_throws();

   public AnimValue id_finally() {
      return (AnimValue)this.id_break[6];
   }

   public UUID id_catch() {
      return (UUID)this.id_break[0];
   }

   public boolean id_extends() {
      return (Boolean)this.id_break[4];
   }

   public abstract String id_case();

   private static void id_continue() {
      id_protected = new long[]{1000L, 1000L, 0L};
   }

   public int id_implements() {
      return (Integer)this.id_break[2];
   }

   private static void id_new() {
      id_throws = new byte[]{7, 2, 3, 4, 5};
   }

   private static void id_package() {
      id_byte = new boolean[]{false, true, false, true, false, false, false};
   }

   private static void id_super() {
      id_case = new short[]{0, 1, 3, 6, 1, 2, 3, 3, 4, 0, 1, 2, 3, 4, 5, 6, 5};
   }

   private static void id_protected() {
      id_class = new float[]{1.0F, 1.0F, 1.0F, 0.0F};
   }

   public long id_private() {
      return (Long)this.id_break[1];
   }

   public boolean id_final() {
      return (Boolean)this.id_break[5];
   }

   public float id_volatile() {
      return (Float)this.id_break[3];
   }

   public void id_native() {
      long var1 = rqR_2.id_break();
      long var3 = var1 - (Long)this.id_break[1];
      long var5 = this.id_throws();
      Integer var11 = (int)(var5 - var3 / 1000L);
      this.id_break[2] = var11;
      Float var12 = Math.min(1.0F, (float)var3 / (float)(var5 * 1000L));
      this.id_break[3] = var12;
      Boolean var13 = this.id_break[3] >= 1.0F ? true : id_byte[2];
      this.id_break[4] = var13;
   }
}
