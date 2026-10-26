package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqQ_2 implements MinecraftAccessor {
   ;
   private static short[] shortsaf585ffa18e23930a314cd0048f74bf2;
   public static Object[] staticFieldsaf585ffa18e23930a314cd0048f74bf2;
   private static byte[] bytesaf585ffa18e23930a314cd0048f74bf2;
   public Object[] fieldsaf585ffa18e23930a314cd0048f74bf2;
   private static String[] stringsaf585ffa18e23930a314cd0048f74bf2;
   private static boolean[] booleansaf585ffa18e23930a314cd0048f74bf2;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{16, -44, 87, 115, -71, 74, 113, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void byte_() {
      if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).isEmpty()) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::f_);
      } else {
         ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).clear();
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::g_);
      }
   }

   private rrqQ_2() {
      this.extends_();
      HashSet var7 = new HashSet();
      this.fieldsaf585ffa18e23930a314cd0048f74bf2[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fieldsaf585ffa18e23930a314cd0048f74bf2[1] = var8;
      this.break_(new rrqv_3());
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7225774521757023521L;
   }

   public void class_(Consumer<rrqz_3> var1) {
      if (((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).isEmpty()) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(rrqd_3::f_);
      } else {
         ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).forEach(var1);
      }
   }

   public int class_(xd_3 var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]) {
         if (var3.byte_() == var1) {
            return var3.class_();
         }
      }

      return bytesaf585ffa18e23930a314cd0048f74bf2[0];
   }

   public void class_(Collection<rrqz_3> var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.class_(var1));
   }

   public void class_(rrqz_3 var1, String var2, boolean var3) {
      if (var1.byte_() == xu_3.class_) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.class_(var2, new u_1("Block not found")));
      } else {
         boolean var4 = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).add(var1);
         if (var3) {
            ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var2x -> var2x.class_(var1, var4));
         }
      }
   }

   public void class_(rrqd_3 var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).remove(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 272204212;
   }

   public void class_() {
      XRay var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().x();
      var1.case_(!var1.continue_() ? true : booleansaf585ffa18e23930a314cd0048f74bf2[2]);
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.g_(var1.continue_()));
   }

   public boolean class_(String var1) {
      rrqz_3 var2 = this.break_(var1);
      if (var2 == null) {
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var1x -> var1x.a_(var1));
         return false;
      } else {
         boolean var3 = ((Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]).remove(var2);
         ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).forEach(var2x -> var2x.break_(var2, var3));
         return var3;
      }
   }

   public boolean break_(xd_3 var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]) {
         if (var3.byte_() == var1) {
            return true;
         }
      }

      return booleansaf585ffa18e23930a314cd0048f74bf2[4];
   }

   public rrqz_3 break_(String var1) {
      for (rrqz_3 var3 : (Set)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0]) {
         if (ri_3.class_(var3.byte_()).equalsIgnoreCase(ri_3.class_(ri_3.class_(var1)))) {
            return var3;
         }
      }

      return null;
   }

   public void break_(rrqd_3 var1) {
      ((List)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1]).add(var1);
   }

   public Set<rrqz_3> break_() {
      return (Set<rrqz_3>)this.fieldsaf585ffa18e23930a314cd0048f74bf2[0];
   }

   private static void throws_() {
      shortsaf585ffa18e23930a314cd0048f74bf2 = new short[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0};
   }

   private static void finally_() {
      booleansaf585ffa18e23930a314cd0048f74bf2 = new boolean[]{false, true, false, true, false, true, false, false, false, true};
   }

   private static void catch_() {
      bytesaf585ffa18e23930a314cd0048f74bf2 = new byte[]{-1, 2, 2};
   }

   private void extends_() {
      if (this.fieldsaf585ffa18e23930a314cd0048f74bf2 == null) {
         this.fieldsaf585ffa18e23930a314cd0048f74bf2 = new Object[2];
      }
   }

   private static void case_() {
      stringsaf585ffa18e23930a314cd0048f74bf2 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   public List<rrqd_3> protected_() {
      return (List<rrqd_3>)this.fieldsaf585ffa18e23930a314cd0048f74bf2[1];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrqQ_2(), null};
      var0[1] = new rrqQ_2[]{(rrqQ_2)var0[0]};
      staticFieldsaf585ffa18e23930a314cd0048f74bf2 = var0;
   }
}
