package celestial;

import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vk_3 extends vm_3 {
   static final Logger implements_ = LogManager.getLogger();
   private static final rgP_2 finally_ = new rgn_3("pack.dropInfo").class_(rgF_2.GRAY);
   private static final rgP_2 else_ = new rgn_3("pack.folderInfo");
   private static final rqO_2 synchronized_ = new rqO_2("textures/misc/unknown_pack.png");
   public final vh_3 class_;
   public final vm_3 throws_;
   private vW_2 return_;
   private long public_;
   protected Li_1 case_;
   protected Li_1 catch_;
   public final File private_;
   private LF goto_;
   private final Map<String, rqO_2> while_ = Maps.newHashMap();

   public vk_3(vm_3 var1, rAt_1 var2, Consumer<rAt_1> var3, File var4, rgP_2 var5) {
      super(var5);
      this.throws_ = var1;
      this.class_ = new vh_3(this::final_, this::class_, var2, var3);
      this.private_ = var4;
      this.return_ = vW_2.class_(var4);
   }

   private rqO_2 class_(fY_2 var1, rAp_1 var2) {
      try {
         rqO_2 var8;
         try (
            rAC var3 = var2.protected_();
            InputStream var4 = var3.class_("pack.png");
         ) {
            String var5 = var2.throws_();
            rqO_2 var6 = new rqO_2("minecraft", "pack/" + rqR_2.class_(var5, rqO_2::break_) + "/" + Hashing.sha1().hashUnencodedChars(var5) + "/icon");
            fN_2 var7 = fN_2.class_(var4);
            var1.class_(var6, new fk_3(var7));
            var8 = var6;
         }

         return var8;
      } catch (FileNotFoundException var13) {
      } catch (Exception var14) {
         implements_.warn("Failed to load icon from pack {}", var2.throws_(), var14);
      }

      return synchronized_;
   }

   protected void class_(Li_1 var1, Stream<vd_3> var2) {
      var1.x_().clear();
      var2.forEach(var2x -> var1.x_().add(new Ar_1(this.volatile_, var1, this, var2x)));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.protected_(0);
      this.case_.class_(var1, var2, var3, var4);
      this.catch_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 8, 16777215);
      class_(var1, this.super_, finally_, this.package_ / 2, 20, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   protected static void class_(QY var0, List<Path> var1, Path var2) {
      MutableBoolean var3 = new MutableBoolean();
      var1.forEach(var2x -> {
         try (Stream var3x = Files.walk(var2x)) {
            var3x.forEach(var3xx -> {
               try {
                  rqR_2.break_(var2x.getParent(), var2, var3xx);
               } catch (IOException var5) {
                  implements_.warn("Failed to copy datapack file  from {} to {}", var3xx, var2, var5);
                  var3.setTrue();
               }
            });
         } catch (IOException var8) {
            implements_.warn("Failed to copy datapack file from {} to {}", var2x, var2);
            var3.setTrue();
         }
      });
   }

   private rqO_2 class_(rAp_1 var1) {
      return this.while_.computeIfAbsent(var1.throws_(), var2 -> this.class_(this.volatile_.A(), var1));
   }

   protected void finally_() {
      this.class_.protected_();
      this.final_();
      this.public_ = 0L;
      this.while_.clear();
   }

   @Override
   public void private_() {
      if (this.return_ != null) {
         try {
            if (this.return_.class_()) {
               this.public_ = 20L;
            }
         } catch (IOException var2) {
            implements_.warn("Failed to poll for directory {} changes, stopping", this.private_);
            this.native_();
         }
      }

      if (this.public_ > 0L && --this.public_ == 0L) {
         this.finally_();
      }
   }

   private void final_() {
      this.class_(this.catch_, this.class_.break_());
      this.class_(this.case_, this.class_.class_());
      this.goto_.int_ = !this.catch_.x_().isEmpty();
   }

   @Override
   public void volatile_() {
      this.class_.byte_();
      this.volatile_.break_(this.throws_);
      this.native_();
   }

   private void native_() {
      if (this.return_ != null) {
         try {
            this.return_.close();
            this.return_ = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   public void a_(List<Path> var1) {
      String var2 = var1.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
      this.volatile_.break_(new mT_2(var2x -> {
         if (var2x) {
            class_(this.volatile_, var1, this.private_.toPath());
            this.finally_();
         }

         this.volatile_.break_(this);
      }, new rgn_3("pack.dropConfirm"), new rgN_2(var2)));
   }

   @Override
   protected void v_() {
      this.goto_ = this.class_((LF)(new LF(this.package_ / 2 + 4, this.int_ - 48, 150, 20, cN_2.byte_, var1 -> this.volatile_())));
      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 154,
            this.int_ - 48,
            150,
            20,
            new rgn_3("pack.openFolder"),
            var1 -> rqR_2.implements_().class_(this.private_),
            (var1, var2, var3, var4) -> this.class_(var2, else_, var3, var4)
         ))
      );
      this.case_ = new Li_1(this.volatile_, 200, this.int_, new rgn_3("pack.available.title"));
      this.case_.throws_(this.package_ / 2 - 4 - 200);
      this.native_.add(this.case_);
      this.catch_ = new Li_1(this.volatile_, 200, this.int_, new rgn_3("pack.selected.title"));
      this.catch_.throws_(this.package_ / 2 + 4);
      this.native_.add(this.catch_);
      this.finally_();
   }
}
