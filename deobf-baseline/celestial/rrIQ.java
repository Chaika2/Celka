package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIQ extends Setting<String> implements rrtf_3<String> {
   public Object[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public rrIQ(String var1, String var2, String... var3) {
      super(var1, var2);
      this.id_package();
      rrIN var8 = (rrIN)rrIN.staticFields6143465a63de38df9c2f3f3e8f0ab649[id_protected[0]];
      this.id_break[id_protected[1]] = var8;
      this.id_class[id_protected[2]] = var1;
      List var10 = Arrays.asList(var3);
      this.id_break[id_protected[3]] = var10;
      Integer var11 = ((List)this.id_break[id_protected[4]]).indexOf(var2);
      this.id_break[id_protected[5]] = var11;
   }

   static {
      ntfClinit();
   }

   public void id_class(String var1, boolean var2) {
      this.id_package();
      if (!((List)this.id_break[id_protected[6]]).contains(var1)) {
         this.id_class((String)((List)this.id_break[id_protected[7]]).get(id_throws[0]), var2, id_throws[1]);
         Integer var7 = Integer.valueOf(id_throws[2]);
         this.id_break[id_protected[8]] = var7;
      } else {
         this.id_class(var1, var2, id_throws[3]);
         Integer var8 = ((List)this.id_break[id_protected[9]]).indexOf(var1);
         this.id_break[id_protected[10]] = var8;
      }
   }

   public rrIQ id_class(rrIN var1) {
      this.id_package();
      this.id_break[id_protected[15]] = var1;
      return this;
   }

   @Override
   public List<String> id_class() {
      this.id_package();
      return (List<String>)this.id_break[id_protected[13]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -912786178;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5893585851365448388L;
   }

   @Override
   public Setting<String> id_break() {
      return this;
   }

   public rrIN id_finally() {
      this.id_package();
      return (rrIN)this.id_break[id_protected[14]];
   }

   public String id_extends() {
      this.id_package();
      return (String)((List)this.id_break[id_protected[11]]).get((Integer)this.id_break[id_protected[12]]);
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
         var1[id_throws[4]] = Integer.valueOf(id_throws[5]);
      }
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 16, 109, -32, -119, 44, 49, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_byte = new byte[]{3};
   }

   private static void id_volatile() {
      id_protected = new short[]{0, 2, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 2, 2};
   }

   private static void id_native() {
      id_throws = new boolean[]{false, true, false, true, true, false};
   }
}
