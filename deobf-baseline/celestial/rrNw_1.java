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
      this.id_break[id_throws[6]] = var1;
   }

   public rrNw_1(rJY var1, String var2, int var3) {
      this.id_break();
      this.id_break[id_throws[0]] = var1;
      this.id_break[id_throws[1]] = var2;
      Integer var10 = var3;
      this.id_break[id_throws[2]] = var10;
   }

   public rrNw_1(rdn_3 var1, String var2, int var3) {
      this.id_break();
      this.id_break[id_throws[3]] = var1;
      this.id_break[id_throws[4]] = var2;
      Integer var10 = var3;
      this.id_break[id_throws[5]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNw_1 var2 = (rrNw_1)var1;
         return this.id_break[id_throws[11]] == var2.id_break[id_throws[12]]
               && Objects.equals(((rdn_3)this.id_break[id_throws[13]]).id_break(), ((rdn_3)var2.id_break[id_throws[14]]).id_break())
               && Objects.equals(((rdn_3)this.id_break[id_throws[15]]).id_char(), ((rdn_3)var2.id_break[id_throws[16]]).id_char())
               && Objects.equals((String)this.id_break[id_throws[17]], (String)var2.id_break[id_throws[18]])
            ? id_protected[2]
            : id_protected[3];
      } else {
         return id_protected[1];
      }
   }

   @Override
   public String toString() {
      return "ItemMetaData{, itemStack="
         + ((rdn_3)this.id_break[id_throws[7]] == null ? id_byte[0] : ((rdn_3)this.id_break[id_throws[8]]).id_continue().id_byte())
         + ", seller='"
         + (String)this.id_break[id_throws[9]]
         + "', price="
         + (Integer)this.id_break[id_throws[10]]
         + "}";
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_class[0]];
      var10000[id_protected[4]] = (rdn_3)this.id_break[id_throws[19]];
      var10000[id_protected[5]] = (String)this.id_break[id_throws[20]];
      var10000[id_class[1]] = (Integer)this.id_break[id_throws[21]];
      return Objects.hash(var10000);
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
      this.id_break[id_throws[26]] = var1;
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
         this.id_break = new Object[id_class[2]];
         Object[] var1 = this.id_break;
         var1[id_class[3]] = Integer.valueOf(id_protected[6]);
      }
   }

   public rJY id_throws() {
      return (rJY)this.id_break[id_throws[22]];
   }

   public String id_catch() {
      return (String)this.id_break[id_throws[24]];
   }

   public int id_case() {
      return (Integer)this.id_break[id_throws[25]];
   }

   private static void id_implements() {
      id_byte = new String[]{new String("null")};
   }

   public rdn_3 id_protected() {
      return (rdn_3)this.id_break[id_throws[23]];
   }

   private static void id_private() {
      id_class = new byte[]{3, 2, 4, 3};
   }
}
