package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mo_3 extends vm_3 {
   private static final Logger catch_ = LogManager.getLogger();
   static final rgP_2 private_ = new rgn_3("selectWorld.gameMode");
   private static final rgP_2 implements_ = new rgn_3("selectWorld.enterSeed");
   private static final rgP_2 finally_ = new rgn_3("selectWorld.seedInfo");
   private static final rgP_2 else_ = new rgn_3("selectWorld.enterName");
   private static final rgP_2 synchronized_ = new rgn_3("selectWorld.resultFolder");
   private static final rgP_2 return_ = new rgn_3("selectWorld.allowCommands.info");
   private final vm_3 public_;
   private Lu_1 goto_;
   String while_;
   Zr_1 try_ = Zr_1.SURVIVAL;
   private Zr_1 instanceof_;
   private rRO throw_ = rRO.NORMAL;
   rRO interface_ = rRO.NORMAL;
   boolean char_;
   private boolean abstract_;
   public boolean class_;
   protected rTH throws_;
   private Path long_;
   private rAt_1 float_;
   private boolean boolean_;
   private LF transient_;
   private LF for_;
   private LF double_;
   private LF switch_;
   private LF r;
   private LF P;
   private LF B;
   rgP_2 S;
   rgP_2 s;
   private String E;
   private rRu_1 G = new rRu_1();
   public final vK_2 case_;

   private void char_() {
      this.byte_(!this.boolean_);
   }

   private void byte_(boolean var1) {
      this.boolean_ = var1;
      this.for_.new_ = !this.boolean_;
      this.double_.new_ = !this.boolean_;
      if (this.case_.class_()) {
         this.P.new_ = false;
         this.for_.int_ = false;
         if (this.instanceof_ == null) {
            this.instanceof_ = this.try_;
         }

         this.class_(Zr_1.DEBUG);
         this.B.new_ = false;
      } else {
         this.for_.int_ = true;
         if (this.instanceof_ != null) {
            this.class_(this.instanceof_);
         }

         this.B.new_ = !this.boolean_;
         this.P.new_ = !this.boolean_;
      }

      this.case_.break_(this.boolean_);
      this.goto_.private_(!this.boolean_);
      if (this.boolean_) {
         this.switch_.break_(cN_2.byte_);
      } else {
         this.switch_.break_(new rgn_3("selectWorld.moreWorldOptions"));
      }

      this.r.new_ = !this.boolean_;
   }

   private void int_() {
      this.while_ = this.goto_.private_().trim();
      if (this.while_.isEmpty()) {
         this.while_ = "World";
      }

      try {
         this.while_ = rpz_3.class_(this.volatile_.M().break_(), this.while_, "");
      } catch (Exception var4) {
         this.while_ = "World";

         try {
            this.while_ = rpz_3.class_(this.volatile_.M().break_(), this.while_, "");
         } catch (Exception var3) {
            throw new RuntimeException("Could not create save folder", var3);
         }
      }
   }

   private void long_() {
      Pair var1 = this.static_();
      if (var1 != null) {
         this.volatile_.break_(new vk_3(this, (rAt_1)var1.getSecond(), this::class_, (File)var1.getFirst(), new rgn_3("dataPack.title")));
      }
   }

   private void float_() {
      if (this.long_ != null) {
         try (Stream var1 = Files.walk(this.long_)) {
            var1.sorted(Comparator.reverseOrder()).forEach(var0 -> {
               try {
                  Files.delete(var0);
               } catch (IOException var2) {
                  catch_.warn("Failed to remove temporary file {}", var0, var2);
               }
            });
         } catch (IOException var6) {
            catch_.warn("Failed to list temporary dir {}", this.long_);
         }

         this.long_ = null;
      }
   }

   public mo_3(vm_3 var1, rYE var2, rrSp_1 var3, Path var4, rTH var5, rVv_1 var6) {
      this(var1, var5, new vK_2(var6, var3, mN_2.class_(var3), OptionalLong.of(var3.class_())));
      this.E = var2.class_();
      this.char_ = var2.throws_();
      this.abstract_ = true;
      this.throw_ = var2.protected_();
      this.interface_ = this.throw_;
      this.G.class_(var2.case_(), (rnW_2)null);
      if (var2.byte_()) {
         this.try_ = Zr_1.HARDCORE;
      } else if (var2.break_().case_()) {
         this.try_ = Zr_1.SURVIVAL;
      } else if (var2.break_().throws_()) {
         this.try_ = Zr_1.CREATIVE;
      }

      this.long_ = var4;
   }

   private mo_3(vm_3 var1, rTH var2, vK_2 var3) {
      super(new rgn_3("selectWorld.create"));
      this.public_ = var1;
      this.E = jI_2.class_("selectWorld.newWorld");
      this.throws_ = var2;
      this.case_ = var3;
   }

   private void interface_() {
      this.volatile_.class_(new ZE(new rgn_3("createWorld.preparing")));
      if (this.void_()) {
         this.abstract_();
         rrSp_1 var1 = this.case_.class_(this.class_);
         rYE var2;
         if (var1.catch_()) {
            rRu_1 var3 = new rRu_1();
            var3.class_(rRu_1.finally_).class_(false, (rnW_2)null);
            var2 = new rYE(this.goto_.private_().trim(), rRl_1.SPECTATOR, false, rRO.PEACEFUL, true, var3, rTH.class_);
         } else {
            var2 = new rYE(
               this.goto_.private_().trim(), this.try_.field_228218_f_, this.class_, this.interface_, this.char_ && !this.class_, this.G, this.throws_
            );
         }

         this.volatile_.class_(this.while_, var2, this.case_.break_(), var1);
      }
   }

   private void class_(rAt_1 var1) {
      ImmutableList var2 = ImmutableList.copyOf(var1.protected_());
      List var3 = var1.break_().stream().filter(var1x -> !var2.contains(var1x)).collect(ImmutableList.toImmutableList());
      rTH var4 = new rTH(var2, var3);
      if (var2.equals(this.throws_.class_())) {
         this.throws_ = var4;
      } else {
         this.volatile_.private_(() -> this.volatile_.break_(new ZE(new rgn_3("dataPack.validation.working"))));
         rAh_1.class_(var1.case_(), gq_3.INTEGRATED, 2, rqR_2.case_(), this.volatile_).handle((var2x, var3x) -> {
            if (var3x != null) {
               catch_.warn("Failed to validate datapack", var3x);
               this.volatile_.private_(() -> this.volatile_.break_(new mT_2(var1xx -> {
                     if (var1xx) {
                        this.long_();
                     } else {
                        this.throws_ = rTH.class_;
                        this.volatile_.break_(this);
                     }
                  }, new rgn_3("dataPack.validation.failed"), rgN_2.byte_, new rgn_3("dataPack.validation.back"), new rgn_3("dataPack.validation.reset"))));
            } else {
               this.volatile_.private_(() -> {
                  this.throws_ = var4;
                  this.case_.class_(var2x);
                  var2x.close();
                  this.volatile_.break_(this);
               });
            }

            return null;
         });
      }
   }

   private static void class_(Path var0, Path var1, Path var2) {
      try {
         rqR_2.break_(var0, var1, var2);
      } catch (IOException var4) {
         catch_.warn("Failed to copy datapack file from {} to {}", var2, var1);
         throw new mi_3(var4);
      }
   }

   @Override
   public <T extends LZ> T class_(T var1) {
      return super.class_((T)var1);
   }

   public static Path class_(Path var0, QY var1) {
      MutableObject var2 = new MutableObject();

      try (Stream var3 = Files.walk(var0)) {
         var3.filter(var1x -> !var1x.equals(var0)).forEach(var2x -> {
            Path var3x = (Path)var2.getValue();
            if (var3x == null) {
               try {
                  var3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  catch_.warn("Failed to create temporary dir");
                  throw new mi_3(var5);
               }

               var2.setValue(var3x);
            }

            class_(var0, var3x, var2x);
         });
      } catch (IOException | mi_3 var8) {
         catch_.warn("Failed to copy datapacks from world {}", var0, var8);
         return null;
      }

      return (Path)var2.getValue();
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.interface_();
         return true;
      }
   }

   private void class_(Zr_1 var1) {
      if (!this.abstract_) {
         this.char_ = var1 == Zr_1.CREATIVE;
      }

      if (var1 == Zr_1.HARDCORE) {
         this.class_ = true;
         this.B.int_ = false;
         this.case_.class_.int_ = false;
         this.interface_ = rRO.HARD;
         this.double_.int_ = false;
      } else {
         this.class_ = false;
         this.B.int_ = true;
         this.case_.class_.int_ = true;
         this.interface_ = this.throw_;
         this.double_.int_ = true;
      }

      this.try_ = var1;
      this.package_();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 20, -1);
      if (this.boolean_) {
         break_(var1, this.super_, implements_, this.package_ / 2 - 100, 47, -6250336);
         break_(var1, this.super_, finally_, this.package_ / 2 - 100, 85, -6250336);
         this.case_.class_(var1, var2, var3, var4);
      } else {
         break_(var1, this.super_, else_, this.package_ / 2 - 100, 47, -6250336);
         break_(var1, this.super_, new rgN_2("").class_(synchronized_).break_(" ").break_(this.while_), this.package_ / 2 - 100, 85, -6250336);
         this.goto_.class_(var1, var2, var3, var4);
         break_(var1, this.super_, this.S, this.package_ / 2 - 150, 122, -6250336);
         break_(var1, this.super_, this.s, this.package_ / 2 - 150, 134, -6250336);
         if (this.B.new_) {
            break_(var1, this.super_, return_, this.package_ / 2 - 150, 172, -6250336);
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   public static mo_3 class_(vm_3 var0) {
      rVv_1 var1 = rVm_1.break_();
      return new mo_3(
         var0,
         rTH.class_,
         new vK_2(var1, rrSp_1.class_(var1.break_(rVL.void_), var1.break_(rVL.n), var1.break_(rVL.u)), Optional.of(mN_2.class_), OptionalLong.empty())
      );
   }

   private boolean void_() {
      if (this.long_ != null) {
         try (
            rrGk_1 var1 = this.volatile_.M().byte_(this.while_);
            Stream var2 = Files.walk(this.long_);
         ) {
            Path var3 = var1.class_(rrGr_1.catch_);
            Files.createDirectories(var3);
            var2.filter(var1x -> !var1x.equals(this.long_)).forEach(var2x -> class_(this.long_, var3, var2x));
         } catch (IOException | mi_3 var9) {
            catch_.warn("Failed to copy datapacks to world {}", this.while_, var9);
            this.native_();
            return false;
         }
      }

      return true;
   }

   public void finally_() {
      this.byte_(this.boolean_);
   }

   private void package_() {
      this.S = new rgn_3("selectWorld.gameMode." + this.try_.field_228217_e_ + ".line1");
      this.s = new rgn_3("selectWorld.gameMode." + this.try_.field_228217_e_ + ".line2");
   }

   private Pair<File, rAt_1> static_() {
      Path var1 = this.final_();
      if (var1 != null) {
         File var2 = var1.toFile();
         if (this.float_ == null) {
            this.float_ = new rAt_1(new rAf_1(), new rAz_1(var2, rAZ.class_));
            this.float_.class_();
         }

         this.float_.class_(this.throws_.class_());
         return Pair.of(var2, this.float_);
      } else {
         return null;
      }
   }

   @Override
   protected <T extends cC_2> T protected_(T var1) {
      return super.protected_((T)var1);
   }

   @Override
   public void private_() {
      this.goto_.catch_();
      this.case_.private_();
   }

   private void abstract_() {
      if (this.float_ != null) {
         this.float_.close();
      }

      this.float_();
   }

   protected Path final_() {
      if (this.long_ == null) {
         try {
            this.long_ = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            catch_.warn("Failed to create temporary dir", var2);
            this.native_();
         }
      }

      return this.long_;
   }

   @Override
   public void volatile_() {
      if (this.boolean_) {
         this.byte_(false);
      } else {
         this.native_();
      }
   }

   public void native_() {
      this.volatile_.break_(this.public_);
      this.abstract_();
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.goto_ = new mK_2(this, this.super_, this.package_ / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterName"));
      this.goto_.class_(this.E);
      this.goto_.class_(var1x -> {
         this.E = var1x;
         this.transient_.int_ = !this.goto_.private_().isEmpty();
         this.int_();
      });
      this.native_.add(this.goto_);
      int var1 = this.package_ / 2 - 155;
      int var2 = this.package_ / 2 + 5;
      this.for_ = this.class_(new mD_2(this, var1, 100, 150, 20, rgN_2.byte_, var1x -> {
         switch (this.try_) {
            case SURVIVAL:
               this.class_(Zr_1.HARDCORE);
               break;
            case HARDCORE:
               this.class_(Zr_1.CREATIVE);
               break;
            case CREATIVE:
               this.class_(Zr_1.SURVIVAL);
         }
      }));
      this.double_ = this.class_(new mU_2(this, var2, 100, 150, 20, new rgn_3("options.difficulty"), var1x -> {
         this.throw_ = this.throw_.protected_();
         this.interface_ = this.throw_;
      }));
      this.B = this.class_(new me_3(this, var1, 151, 150, 20, new rgn_3("selectWorld.allowCommands"), var1x -> {
         this.abstract_ = true;
         this.char_ = !this.char_;
      }));
      this.P = this.class_(new LF(var2, 151, 150, 20, new rgn_3("selectWorld.dataPacks"), var1x -> this.long_()));
      this.r = this.class_(new LF(var1, 185, 150, 20, new rgn_3("selectWorld.gameRules"), var1x -> this.volatile_.break_(new ZJ(this.G.break_(), var1xx -> {
            this.volatile_.break_(this);
            var1xx.ifPresent(var1xxx -> this.G = var1xxx);
         }))));
      this.case_.class_(this, this.volatile_, this.super_);
      this.switch_ = this.class_(new LF(var2, 185, 150, 20, new rgn_3("selectWorld.moreWorldOptions"), var1x -> this.char_()));
      this.transient_ = this.class_(new LF(var1, this.int_ - 28, 150, 20, new rgn_3("selectWorld.create"), var1x -> this.interface_()));
      this.transient_.int_ = !this.E.isEmpty();
      this.class_(new LF(var2, this.int_ - 28, 150, 20, cN_2.protected_, var1x -> this.native_()));
      this.finally_();
      this.break_(this.goto_);
      this.class_(this.try_);
      this.int_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
