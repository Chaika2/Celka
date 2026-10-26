package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class rrIJ implements rrZS<rrIX> {
   private static short[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   private static boolean[] case_;
   public Object[] break_;

   public List<rrwj_3> byte_() {
      return (List<rrwj_3>)this.break_[1];
   }

   public boolean byte_(String var1) {
      return ((Map)this.break_[0]).entrySet().stream().anyMatch(var1x -> ((String)var1x.getKey()).equalsIgnoreCase(var1.toLowerCase()));
   }

   public boolean byte_(rrIX var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         JsonObject var3 = new JsonObject();
         var1.break_(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var1.throws_(), var3);
         if (var2) {
            if (!this.class_(var1) && var1 != this.protected_()) {
               ((List)this.break_[2]).forEach(var1x -> var1x.protected_(var1));
            }
         } else {
            ((List)this.break_[2]).forEach(var1x -> var1x.class_(var1));
         }

         return case_[11];
      }
   }

   @Override
   public boolean byte_(String var1, boolean var2) {
      rrIX var3 = this.protected_(var1);
      if (var3 == null) {
         var3 = new rrIX(var1);
         ((Map)this.break_[0]).put(var1, var3);
      }

      return this.byte_(var3, var2);
   }

   public rrIJ() {
      this.native_();
      HashMap var5 = new HashMap();
      this.break_[0] = var5;
      ArrayList var6 = new ArrayList();
      this.break_[1] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[2] = var7;
      this.private_();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(String var1, boolean var2) {
      rrIX var3 = this.protected_(var1);
      return this.class_(var3, var2);
   }

   public boolean class_(rrIX var1, boolean var2) {
      try {
         if (var1 == null) {
            return case_[6];
         } else {
            JsonObject var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[byte_[8]]).break_().break_(var1.throws_()).getAsJsonObject();
            if (var3 == null) {
               return case_[7];
            } else {
               var1.class_(var3);
               if (var2) {
                  ((List)this.break_[byte_[9]]).forEach(var1x -> var1x.break_(var1));
               }

               this.break_[byte_[10]] = var1;
               return case_[8];
            }
         }
      } catch (Exception var9) {
         return false;
      }
   }

   private void class_(rrwj_3... var1) {
      ((List)this.break_[1]).addAll(List.of(var1));
   }

   @Override
   public void class_() {
      for (rrIX var2 : this.break_()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var2.throws_())) {
            this.break_(var2, true);
         }
      }
   }

   public void class_(rrZp_1... var1) {
      ((List)this.break_[2]).addAll(List.of(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5830413674298574628L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -920288770;
   }

   public boolean class_(rrIX var1) {
      return var1.class_().equals("autocfg");
   }

   @Override
   public void class_(boolean var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("configs");
      File[] var3 = var2.listFiles();
      if (var3 != null) {
         for (File var7 : var3) {
            if (FilenameUtils.getExtension(var7.getName()).equals(".celka".substring(1))) {
               String var8 = FilenameUtils.removeExtension(var7.getName());
               rrIX var9 = new rrIX(var8);
               var9.byte_();
               if (var1 && !((Map)this.break_[0]).containsKey(var8)) {
                  ((List)this.break_[2]).forEach(var1x -> var1x.protected_(var9));
               }

               ((Map)this.break_[0]).put(var8, var9);
            }
         }
      }
   }

   @Override
   public boolean break_(String var1, boolean var2) {
      rrIX var3 = this.protected_(var1);
      return var3 != null && this.break_(var3, var2) ? true : case_[13];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -53, -85, 116, -107, 98, 55, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean break_(rrIX var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         File var3 = var1.throws_();
         ((Map)this.break_[0]).remove(var1.class_());
         if (var2 && !this.class_(var1)) {
            ((List)this.break_[2]).forEach(var1x -> var1x.byte_(var1));
         }

         return var3.exists() && var3.delete() ? true : case_[16];
      }
   }

   @Override
   public Collection<rrIX> break_() {
      return ((Map)this.break_[0]).values().stream().filter(var1 -> !this.class_(var1) ? true : case_[19]).toList();
   }

   @Override
   public void break_(boolean var1) {
      for (rrIX var3 : this.break_()) {
         this.class_(var3, var1);
      }
   }

   public Map<String, rrIX> throws_() {
      return (Map<String, rrIX>)this.break_[0];
   }

   private static void finally_() {
      protected_ = new byte[]{2, 4};
   }

   public void catch_() {
      this.class_(true);
      this.class_();
   }

   private static void extends_() {
      throws_ = new String[]{new String("configs"), new String(".celka"), new String("configs"), new String("autocfg")};
   }

   public List<rrZp_1> case_() {
      return (List<rrZp_1>)this.break_[2];
   }

   private static void implements_() {
      case_ = new boolean[]{false, true, false, true, false, true, false, false, true, false, false, true, true, false, false, true, false, true, true, false};
   }

   public rrIX protected_() {
      return (rrIX)this.break_[3];
   }

   public rrIX protected_(String var1) {
      if (((Map)this.break_[0]).containsKey(var1)) {
         return (rrIX)((Map)this.break_[0]).get(var1);
      } else {
         File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("configs");
         return new File(var2, var1 + ".celka").exists() ? new rrIX(var1) : null;
      }
   }

   private void private_() {
      this.class_(new rrIx_1(), new rrId_1());
      this.class_(false);
   }

   private static void volatile_() {
      byte_ = new short[]{0, 1, 2, 1, 0, 0, 2, 0, 0, 2, 3, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 3, 2, 1, 0};
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }
}
