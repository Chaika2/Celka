package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLp_1 extends Om_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static short[] id_throws;
   public Object[] id_break;

   public rrLp_1() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 671858019723482893L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -119, -76, -98, -22, 7, -62, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      this.id_catch();
      Integer var6 = var1;
      this.id_break[4] = var6;
   }

   public static rrLp_1 id_class(rrLq_1 var0, rfH_2 var1, rpr_3 var2, rdn_3 var3, int var4) {
      rrLp_1 var5 = id_break(var0, var1, var2, var3, var4);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[12]]).id_finally().id_class(var5);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[13]]).id_class(var5);
      return var5;
   }

   public rfH_2 id_class() {
      this.id_catch();
      return (rfH_2)this.id_break[1];
   }

   private static rrLp_1 id_break(rrLq_1 var0, rfH_2 var1, rpr_3 var2, rdn_3 var3, int var4) {
      ((rrLp_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrLp_1)id_class[id_throws[2]]).id_break[1] = var1;
      ((rrLp_1)id_class[id_throws[4]]).id_break[2] = var2;
      ((rrLp_1)id_class[id_throws[6]]).id_break[3] = var3;
      rrLp_1 var10000 = (rrLp_1)id_class[id_throws[8]];
      Integer var13 = var4;
      var10000.id_break[4] = var13;
      ((rrLp_1)id_class[id_throws[10]]).id_class(id_protected[0]);
      return (rrLp_1)id_class[id_throws[11]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -728841981;
   }

   public int id_break() {
      this.id_catch();
      return (Integer)this.id_break[4];
   }

   public rdn_3 id_throws() {
      this.id_catch();
      return (rdn_3)this.id_break[3];
   }

   private static void id_finally() {
      id_protected = new boolean[]{false, false, false, true};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         Object[] var1 = this.id_break;
         var1[4] = Integer.valueOf(id_protected[2]);
      }
   }

   private static void id_extends() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0, 0, 1, 2, 3, 4, 4};
   }

   public rrLq_1 id_case() {
      this.id_catch();
      return (rrLq_1)this.id_break[id_throws[14]];
   }

   private static void id_implements() {
      id_byte = new byte[]{5, 4};
   }

   public rpr_3 id_protected() {
      this.id_catch();
      return (rpr_3)this.id_break[2];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrLp_1()};
      id_class = var0;
   }
}
