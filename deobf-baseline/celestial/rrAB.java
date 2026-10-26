package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAB extends Om_1 {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;
   private static float[] id_case;

   public void id_byte(float var1) {
      this.id_extends();
      Float var6 = var1;
      this.id_class[id_throws[27]] = var6;
   }

   public rrAB() {
      this.id_extends();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2844221065803574656L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, -37, -103, 72, -27, -113, 6, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      this.id_extends();
      return (Integer)this.id_class[id_throws[23]];
   }

   public void id_class(rdn_3 var1) {
      this.id_extends();
      this.id_class[id_throws[24]] = var1;
   }

   public void id_class(float var1) {
      this.id_extends();
      Float var6 = var1;
      this.id_class[id_throws[28]] = var6;
   }

   public boolean id_class(rdb_3 var1) {
      this.id_extends();
      return ((rdn_3)this.id_class[id_throws[16]]).id_break() != var1 && ((rdn_3)this.id_class[id_throws[17]]).id_break() != var1 ? id_byte[2] : id_byte[1];
   }

   public void id_class(int var1) {
      this.id_extends();
      Integer var6 = var1;
      this.id_class[id_throws[29]] = var6;
   }

   public static rrAB id_class(rdn_3 var0, rdn_3 var1, rpm_3 var2, int var3, float var4, float var5) {
      ((rrAB)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      ((rrAB)id_break[id_throws[2]]).id_class[id_throws[3]] = var1;
      ((rrAB)id_break[id_throws[4]]).id_class[id_throws[5]] = var2;
      rrAB var10000 = (rrAB)id_break[id_throws[6]];
      Integer var13 = var3;
      var10000.id_class[id_throws[7]] = var13;
      var10000 = (rrAB)id_break[id_throws[8]];
      Float var14 = var4;
      var10000.id_class[id_throws[9]] = var14;
      var10000 = (rrAB)id_break[id_throws[10]];
      Float var15 = var5;
      var10000.id_class[id_throws[11]] = var15;
      ((rrAB)id_break[id_throws[12]]).id_class(id_byte[0]);
      return (rrAB)id_break[id_throws[13]];
   }

   public void id_class(rpm_3 var1) {
      this.id_extends();
      this.id_class[id_throws[26]] = var1;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -389387108;
   }

   public void id_break(rdn_3 var1) {
      this.id_extends();
      this.id_class[id_throws[25]] = var1;
   }

   public void id_break(float var1) {
      this.id_extends();
      Float var6 = var1;
      this.id_class[id_throws[14]] = var6;
      Float var7 = var1;
      this.id_class[id_throws[15]] = var7;
   }

   public float id_break() {
      this.id_extends();
      return (Float)this.id_class[id_throws[22]];
   }

   public rpm_3 id_throws() {
      this.id_extends();
      return (rpm_3)this.id_class[id_throws[20]];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrAB()};
      id_break = var0;
   }

   public rdn_3 id_catch() {
      this.id_extends();
      return (rdn_3)this.id_class[id_throws[19]];
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = id_case[0];
         var1[id_protected[2]] = id_case[1];
         var1[id_protected[3]] = Integer.valueOf(id_byte[4]);
      }
   }

   public float id_case() {
      this.id_extends();
      return (Float)this.id_class[id_throws[21]];
   }

   private static void id_implements() {
      id_protected = new byte[]{6, 3, 4, 5};
   }

   public rdn_3 id_protected() {
      this.id_extends();
      return (rdn_3)this.id_class[id_throws[18]];
   }

   private static void id_private() {
      id_byte = new boolean[]{false, true, false, false, false, true};
   }

   private static void id_volatile() {
      id_throws = new short[]{0, 1, 0, 0, 0, 2, 0, 5, 0, 3, 0, 4, 0, 0, 3, 4, 1, 0, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void id_native() {
      id_case = new float[2];
   }
}
