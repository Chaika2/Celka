package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvD implements rrvU {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static float[] id_throws;

   @Override
   public boolean id_byte() {
      return id_byte[3];
   }

   public rrvD(rdn_3 var1) {
      this.id_final();
      AnimValue var6 = new AnimValue(0.5F, id_byte[0]);
      this.id_class[4] = var6;
      this.id_class[id_break[1]] = var1;
      String var8 = rrvK.id_byte(var1.id_continue().id_byte());
      this.id_class[1] = var8;
      String var9 = this.id_extends();
      this.id_class[2] = var9;
      Integer var10 = this.id_implements();
      this.id_class[3] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrvD var2 = (rrvD)var1;
         return Objects.equals(((rdn_3)this.id_class[id_break[17]]).id_continue(), ((rdn_3)var2.id_class[id_break[18]]).id_continue());
      } else {
         return id_byte[6];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((rdn_3)this.id_class[id_break[19]]).id_continue());
   }

   @Override
   public String id_class() {
      return (String)this.id_class[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8414222941013334400L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -969812477;
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[4]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, 77, 85, 104, 119, 35, 115, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public AnimValue id_break() {
      return (AnimValue)this.id_class[4];
   }

   public void id_throws() {
      Integer var5 = this.id_implements();
      this.id_class[3] = var5;
      String var6 = this.id_extends();
      this.id_class[2] = var6;
   }

   private static void id_finally() {
      id_break = new short[]{4, 0, 1, 2, 3, 1, 2, 4, 3, 3, 2, 3, 57, 57, 0, 57, 0, 0, 0, 0, 0, 3, 4};
   }

   @Override
   public boolean id_catch() {
      return this.id_class[3] > 0 ? true : id_byte[2];
   }

   private String id_extends() {
      return rql_3.id_class((Integer)this.id_class[3]);
   }

   @Override
   public String id_case() {
      return (String)this.id_class[1];
   }

   int id_implements() {
      return (cb_3)MinecraftAccessor.id_import.id_class[57] == null
         ? id_byte[4]
         : Math.max(
            ((cb_3)MinecraftAccessor.id_import.id_class[57]).sK().id_protected(((rdn_3)this.id_class[id_break[14]]).id_break()),
            ((cb_3)MinecraftAccessor.id_import.id_class[57]).r().id_byte((rdn_3)this.id_class[id_break[16]])
         );
   }

   private static void id_package() {
      id_protected = new byte[]{5, 3};
   }

   public int id_protected() {
      return (Integer)this.id_class[3];
   }

   public rdn_3 id_private() {
      return (rdn_3)this.id_class[id_break[20]];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[3] = Integer.valueOf(id_byte[7]);
      }
   }

   private static void id_volatile() {
      id_byte = new boolean[]{false, true, false, false, false, true, false, false};
   }

   private static void id_native() {
      id_throws = new float[]{0.5F};
   }
}
