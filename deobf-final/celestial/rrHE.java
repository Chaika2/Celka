package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrHE implements MinecraftAccessor {
   ;
   public Object[] fieldsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static String[] stringsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static boolean[] booleansba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static short[] shortsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static byte[] bytesba1f59fc216a32d3a8f1aabb25cf0fd2;
   public static Object[] staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2;

   public xd_3 byte_(String var1) {
      for (xd_3 var3 : (Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]) {
         if (ri_3.class_(var3).equalsIgnoreCase(ri_3.class_(ri_3.class_(var1)))) {
            return var3;
         }
      }

      return null;
   }

   public Set<xd_3> byte_() {
      return (Set<xd_3>)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0];
   }

   private rrHE() {
      this.finally_();
      HashSet var7 = new HashSet();
      this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1] = var8;
      this.class_(new rrHd_1());
   }

   static {
      ntfClinit();
   }

   public void class_(rrHx_1 var1) {
      ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).add(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 997621086;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, -88, -70, -92, -68, 90, 102, 104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3911705072490252313L;
   }

   public boolean class_(xd_3 var1) {
      return ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).contains(var1);
   }

   public void class_(xd_3 var1, String var2, boolean var3) {
      if (var1 == xu_3.class_) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var1x -> var1x.class_(var2, new u_1("Block not found")));
      } else {
         boolean var4 = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).add(var1);
         if (var3) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var2x -> var2x.break_(var1, var4));
         }
      }
   }

   public List<rrHx_1> class_() {
      return (List<rrHx_1>)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1];
   }

   public void class_(Consumer<xd_3> var1) {
      if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).isEmpty()) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::class_);
      } else {
         ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).forEach(var1);
      }
   }

   public void break_() {
      if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).isEmpty()) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::class_);
      } else {
         ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).clear();
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::break_);
      }
   }

   public boolean break_(String var1) {
      xd_3 var2 = this.byte_(var1);
      if (var2 == null) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var1x -> var1x.class_(var1));
         return false;
      } else {
         boolean var3 = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).remove(var2);
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var2x -> var2x.class_(var2, var3));
         return var3;
      }
   }

   private void finally_() {
      if (this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 == null) {
         this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = new Object[2];
      }
   }

   private static void catch_() {
      shortsba1f59fc216a32d3a8f1aabb25cf0fd2 = new short[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrHE(), null};
      var0[1] = new rrHE[]{(rrHE)var0[0]};
      staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = var0;
   }

   private static void implements_() {
      stringsba1f59fc216a32d3a8f1aabb25cf0fd2 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   private static void protected_() {
      bytesba1f59fc216a32d3a8f1aabb25cf0fd2 = new byte[]{2, 2};
   }

   private static void private_() {
      booleansba1f59fc216a32d3a8f1aabb25cf0fd2 = new boolean[]{false, true, false, false, false, true};
   }
}
