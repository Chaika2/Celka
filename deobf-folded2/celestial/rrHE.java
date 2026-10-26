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
   public Object[] fieldsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static String[] stringsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static boolean[] booleansba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static short[] shortsba1f59fc216a32d3a8f1aabb25cf0fd2;
   private static byte[] bytesba1f59fc216a32d3a8f1aabb25cf0fd2;
   public static Object[] staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2;

   public xd_3 id_byte(String var1) {
      for (xd_3 var3 : (Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]) {
         if (ri_3.id_class(var3).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(var1)))) {
            return var3;
         }
      }

      return null;
   }

   public Set<xd_3> id_byte() {
      return (Set<xd_3>)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0];
   }

   private rrHE() {
      this.id_finally();
      HashSet var7 = new HashSet();
      this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1] = var8;
      this.id_class(new rrHd_1());
   }

   static {
      ntfClinit();
   }

   public void id_class(rrHx_1 var1) {
      ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).add(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 997621086;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, -88, -70, -92, -68, 90, 102, 104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3911705072490252313L;
   }

   public boolean id_class(xd_3 var1) {
      return ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).contains(var1);
   }

   public void id_class(xd_3 var1, String var2, boolean var3) {
      if (var1 == xu_3.id_class) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var1x -> var1x.id_class(var2, new u_1("Block not found")));
      } else {
         boolean var4 = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).add(var1);
         if (var3) {
            ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var2x -> var2x.id_break(var1, var4));
         }
      }
   }

   public List<rrHx_1> id_class() {
      return (List<rrHx_1>)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1];
   }

   public void id_class(Consumer<xd_3> var1) {
      if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).isEmpty()) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::id_class);
      } else {
         ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).forEach(var1);
      }
   }

   public void id_break() {
      if (((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).isEmpty()) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::id_class);
      } else {
         ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).clear();
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(rrHx_1::id_break);
      }
   }

   public boolean id_break(String var1) {
      xd_3 var2 = this.id_byte(var1);
      if (var2 == null) {
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var1x -> var1x.id_class(var1));
         return false;
      } else {
         boolean var3 = ((Set)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).remove(var2);
         ((List)this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2[1]).forEach(var2x -> var2x.id_class(var2, var3));
         return var3;
      }
   }

   private void id_finally() {
      if (this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 == null) {
         this.fieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = new Object[2];
      }
   }

   private static void id_catch() {
      shortsba1f59fc216a32d3a8f1aabb25cf0fd2 = new short[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrHE(), null};
      var0[1] = new rrHE[]{(rrHE)var0[0]};
      staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2 = var0;
   }

   private static void id_implements() {
      stringsba1f59fc216a32d3a8f1aabb25cf0fd2 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   private static void id_protected() {
      bytesba1f59fc216a32d3a8f1aabb25cf0fd2 = new byte[]{2, 2};
   }

   private static void id_private() {
      booleansba1f59fc216a32d3a8f1aabb25cf0fd2 = new boolean[]{false, true, false, false, false, true};
   }
}
