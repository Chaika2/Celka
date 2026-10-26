package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqP_2 implements rrqr_3 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static float[] id_case;
   public Object[] id_class;

   @Override
   public rgP_2 id_byte() {
      return ((rrqs_3)this.id_class[id_protected[9]]).id_byte().id_class();
   }

   private static void id_int() {
      id_protected = new short[]{4, 5, 2, 0, 1, 3, 0, 4, 4, 3, 3, 5, 5, 0, 0, 0, 0, 1, 2, 3, 4, 5};
   }

   public rrqP_2(rrqB_2 var1, Aw_1 var2, String var3) {
      this.id_continue();
      rgN_2 var8 = new rgN_2(id_throws[0]);
      this.id_class[id_protected[0]] = var8;
      AnimValue var9 = new AnimValue(id_case[0], id_byte[0]);
      this.id_class[id_protected[1]] = var9;
      this.id_class[id_protected[2]] = var1;
      this.id_class[id_protected[3]] = var2;
      this.id_class[id_protected[4]] = var3;
      rrqs_3 var13 = new rrqs_3(this);
      this.id_class[id_protected[5]] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_byte[4];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqP_2 var2 = (rrqP_2)var1;
         return Objects.equals(((Aw_1)this.id_class[id_protected[13]]).id_class().getName(), ((Aw_1)var2.id_class[id_protected[14]]).id_class().getName());
      } else {
         return id_byte[5];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_byte[6]];
      var10000[id_byte[7]] = ((Aw_1)this.id_class[id_protected[15]]).id_class().getName();
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -25132894151454775L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 867679361;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -77, -101, 97, 111, 101, 45, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[id_protected[11]]).id_class(var1);
   }

   public Aw_1 id_class() {
      return (Aw_1)this.id_class[id_protected[16]];
   }

   @Override
   public AnimValue id_break() {
      return (AnimValue)this.id_class[id_protected[21]];
   }

   @Override
   public boolean id_throws() {
      return id_byte[3];
   }

   public rrqs_3 id_finally() {
      return (rrqs_3)this.id_class[id_protected[19]];
   }

   @Override
   public boolean id_catch() {
      return !((AnimValue)this.id_class[id_protected[12]]).id_new() ? id_byte[1] : id_byte[2];
   }

   public String id_extends() {
      return (String)this.id_class[id_protected[17]];
   }

   public rrqB_2 id_case() {
      return (rrqB_2)this.id_class[id_protected[18]];
   }

   private void id_continue() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
      }
   }

   public rVi_1 id_implements() {
      rgP_2 var1 = uR_2.id_break((Aw_1)this.id_class[id_protected[6]]);
      rgN_2 var2 = new rgN_2(id_throws[1]);
      rgN_2 var3 = new rgN_2(id_throws[2]);
      if (!var2.id_protected().isEmpty()) {
         var3.id_class(var2);
      }

      if (!((rgN_2)this.id_class[id_protected[7]]).id_protected().isEmpty()) {
         var3.id_class((rgN_2)this.id_class[id_protected[8]]);
      }

      var3.id_class(var1);
      return var3;
   }

   private static void id_new() {
      id_break = new byte[]{6};
   }

   private static void id_package() {
      id_throws = new String[]{new String(""), new String(""), new String("")};
   }

   @Override
   public String id_private() {
      return ((rrqs_3)this.id_class[id_protected[10]]).id_byte().id_break();
   }

   private static void id_final() {
      id_byte = new boolean[]{false, true, false, false, true, false, true, false};
   }

   private static void id_volatile() {
      id_case = new float[]{0.5F};
   }

   public rgN_2 id_native() {
      return (rgN_2)this.id_class[id_protected[20]];
   }
}
