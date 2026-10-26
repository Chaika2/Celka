package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNw_1 {
   public Object[] id_break;
   private static byte[] id_class;
   private static String[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_protected = new boolean[]{true, false, true, false, false, true, false};
   }

   public rrNw_1(rdn_3 var1) {
      this.id_break();
      this.id_break[1] = var1;
   }

   public rrNw_1(rJY var1, String var2, int var3) {
      this.id_break();
      this.id_break[0] = var1;
      this.id_break[2] = var2;
      Integer var10 = var3;
      this.id_break[3] = var10;
   }

   public rrNw_1(rdn_3 var1, String var2, int var3) {
      this.id_break();
      this.id_break[1] = var1;
      this.id_break[2] = var2;
      Integer var10 = var3;
      this.id_break[3] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNw_1 var2 = (rrNw_1)var1;
         return this.id_break[3] == var2.id_break[3]
               && Objects.equals(((rdn_3)this.id_break[1]).id_break(), ((rdn_3)var2.id_break[1]).id_break())
               && Objects.equals(((rdn_3)this.id_break[1]).id_char(), ((rdn_3)var2.id_break[1]).id_char())
               && Objects.equals((String)this.id_break[2], (String)var2.id_break[2])
            ? true
            : id_protected[3];
      } else {
         return id_protected[1];
      }
   }

   @Override
   public String toString() {
      return "ItemMetaData{, itemStack="
         + ((rdn_3)this.id_break[1] == null ? "null" : ((rdn_3)this.id_break[1]).id_continue().id_byte())
         + ", seller='"
         + (String)this.id_break[2]
         + "', price="
         + (Integer)this.id_break[3]
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash((rdn_3)this.id_break[1], (String)this.id_break[2], (Integer)this.id_break[3]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8017418041711901448L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 609615075;
   }

   private static void id_class() {
      id_throws = new short[]{0, 2, 3, 1, 2, 3, 1, 1, 1, 2, 3, 3, 3, 1, 1, 1, 1, 2, 2, 1, 2, 3, 0, 1, 2, 3, 1};
   }

   public void id_class(rdn_3 var1) {
      this.id_break[1] = var1;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, 31, -116, -128, 40, 87, -44, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
         var1[3] = 0;
      }
   }

   public rJY id_throws() {
      return (rJY)this.id_break[0];
   }

   public String id_catch() {
      return (String)this.id_break[2];
   }

   public int id_case() {
      return (Integer)this.id_break[3];
   }

   private static void id_implements() {
      id_byte = new String[]{new String("null")};
   }

   public rdn_3 id_protected() {
      return (rdn_3)this.id_break[1];
   }

   private static void id_private() {
      id_class = new byte[]{3, 2, 4, 3};
   }
}
