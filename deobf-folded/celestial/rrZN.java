package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrZN implements MinecraftAccessor {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   public void id_byte(int var1, int var2, int var3) {
   }

   public rrZN() {
      this.id_volatile();
      rrvx_1 var5 = new rrvx_1();
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      return var6 && rrtu_3.id_class(var1, var2, var3) ? id_protected[7] : true;
   }

   public void id_class(rrFK var1) {
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      return var5 && rrtu_3.id_class(var1, var2, var3) ? id_protected[3] : true;
   }

   public void id_class(Category var1, Category var2) {
      AnimValue var3 = this.id_implements().id_class();
      var3.id_extends();
      if (this instanceof rrZT var4) {
         var4.id_case().id_package().id_extends();
      }
   }

   public boolean id_class(int var1, int var2, float var3, float var4, float var5, float var6) {
      return (float)var1 >= var3 && (float)var1 <= var3 + var5 && (float)var2 >= var4 && (float)var2 <= var4 + var6 ? true : id_protected[12];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4406281564037110083L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -332116438;
   }

   public boolean id_class(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      return var9 && rrtu_3.id_class(var2, var7, var8) ? id_protected[5] : true;
   }

   public boolean id_class(int var1, int var2, int var3) {
      return id_protected[8];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-109, 106, -17, -74, 48, -109, 44, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(char var1, int var2) {
      return id_protected[9];
   }

   public void id_break(int var1, int var2, int var3) {
   }

   public void id_throws() {
   }

   private static void id_finally() {
      id_byte = new byte[]{2};
   }

   public void id_catch() {
   }

   private static void id_extends() {
      id_protected = new boolean[]{true, false, true, false, true, false, true, false, false, false, true, true, false, true, false};
   }

   public rrvx_1 id_implements() {
      return (rrvx_1)this.id_class[id_break[4]];
   }

   public void id_protected() {
   }

   public void id_private() {
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = id_protected[14];
      }
   }

   private static void id_native() {
      id_break = new short[]{0, 1, 1, 1, 0};
   }

   public void d_(boolean var1) {
      Boolean var6 = var1;
      this.id_class[1] = var6;
   }

   public boolean ai_() {
      return (Boolean)this.id_class[1];
   }

   public boolean aj_() {
      return true;
   }

   public boolean ak_() {
      AnimValue var1 = this.id_implements().id_class();
      return this.id_class[1] && var1.id_new() && var1.id_protected() ? true : id_protected[1];
   }

   public rdn_3 ag_() {
      return null;
   }
}
