/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.Callbacks
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWImage
 *  org.lwjgl.glfw.GLFWImage$Buffer
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 */
package celestial;

import celestial.HN;
import celestial.Hk_1;
import celestial.QR;
import celestial.Qa_1;
import celestial.Ve_1;
import celestial.fo_3;
import celestial.rrGY;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.rrzJ_2;
import celestial.yM_2;
import celestial.ys_3;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.opengl.GL;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public final class Qg_1
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private final GLFWErrorCallback id_break = GLFWErrorCallback.create(this::id_class);
    private final Hk_1 id_byte;
    private final HN id_protected;
    private final long id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private Optional<yM_2> id_finally;
    private boolean id_extends;
    private boolean id_native;
    private int id_volatile;
    private int id_final;
    private int id_package;
    private int id_int;
    private int id_new;
    private int id_continue;
    private int id_super;
    private int id_this;
    private double id_else;
    private String id_synchronized = "";
    private boolean id_return;
    private int id_public;
    private boolean id_goto;
    private boolean id_while;

    private void id_byte(long l, int n, int n2) {
        this.id_package = n;
        this.id_int = n2;
    }

    private void id_byte(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        try {
            this.id_instanceof();
            this.id_byte.v();
            this.id_class(bl);
            this.id_throws();
        }
        catch (Exception exception) {
            id_class.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    public void id_byte() {
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.id_break);
        if (gLFWErrorCallback != null) {
            gLFWErrorCallback.free();
        }
        rrzJ_2.id_byte();
    }

    public float id_int() {
        return (float)this.id_this() / 2.0f;
    }

    public Qg_1(Hk_1 hk_1, HN hN, ys_3 ys_32, String string, String string2) {
        Object object;
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        this.id_protected = hN;
        this.id_while();
        this.id_class("Pre startup");
        this.id_byte = hk_1;
        Optional<yM_2> optional = yM_2.id_class(string);
        this.id_finally = optional.isPresent() ? optional : (ys_32.id_byte.isPresent() && ys_32.id_protected.isPresent() ? Optional.of(new yM_2(ys_32.id_byte.getAsInt(), ys_32.id_protected.getAsInt(), 8, 8, 8, 60)) : Optional.empty());
        this.id_native = this.id_extends = ys_32.id_throws;
        Qa_1 qa_1 = hN.id_class(GLFW.glfwGetPrimaryMonitor());
        this.id_package = ys_32.id_class > 0 ? ys_32.id_class : 1;
        this.id_private = this.id_package;
        this.id_int = ys_32.id_break > 0 ? ys_32.id_break : 1;
        this.id_implements = this.id_int;
        GLFW.glfwDefaultWindowHints();
        if (rrbb_3.T()) {
            GLFW.glfwWindowHint((int)135181, (int)rrbb_3.q());
        }
        GLFW.glfwWindowHint((int)139265, (int)196609);
        GLFW.glfwWindowHint((int)139275, (int)221185);
        GLFW.glfwWindowHint((int)139266, (int)2);
        GLFW.glfwWindowHint((int)139267, (int)0);
        GLFW.glfwWindowHint((int)139272, (int)0);
        long l = 0L;
        if (rrxr_3.id_abstract.id_byte()) {
            object = rrxr_3.id_class(rrxr_3.id_char);
            l = rrxr_3.id_protected(object, rrxr_3.id_abstract, () -> this.id_package, () -> this.id_int, () -> string2, () -> this.id_extends && qa_1 != null ? qa_1.id_case() : 0L);
            if (rrbb_3.T()) {
                GLFW.glfwDestroyWindow((long)l);
                l = 0L;
            }
        }
        this.id_throws = l != 0L ? l : GLFW.glfwCreateWindow((int)this.id_package, (int)this.id_int, (CharSequence)string2, (long)(this.id_extends && qa_1 != null ? qa_1.id_case() : 0L), (long)0L);
        if (qa_1 != null) {
            object = qa_1.id_class(this.id_extends ? this.id_finally : Optional.empty());
            this.id_case = this.id_volatile = qa_1.id_byte() + ((yM_2)object).id_class() / 2 - this.id_package / 2;
            this.id_catch = this.id_final = qa_1.id_protected() + ((yM_2)object).id_break() / 2 - this.id_int / 2;
        } else {
            object = new int[1];
            int[] nArray = new int[1];
            GLFW.glfwGetWindowPos((long)this.id_throws, (int[])object, (int[])nArray);
            Object object2 = object[0];
            this.id_volatile = (int)object2;
            this.id_case = (int)object2;
            this.id_catch = this.id_final = nArray[0];
        }
        GLFW.glfwMakeContextCurrent((long)this.id_throws);
        GL.createCapabilities();
        this.id_instanceof();
        this.id_try();
        GLFW.glfwSetFramebufferSizeCallback((long)this.id_throws, this::id_break);
        GLFW.glfwSetWindowPosCallback((long)this.id_throws, this::id_class);
        GLFW.glfwSetWindowSizeCallback((long)this.id_throws, this::id_byte);
        GLFW.glfwSetWindowFocusCallback((long)this.id_throws, this::id_class);
        GLFW.glfwSetCursorEnterCallback((long)this.id_throws, this::id_break);
    }

    public int id_this() {
        return this.id_this;
    }

    public void id_class(Optional<yM_2> optional) {
        boolean bl = !optional.equals(this.id_finally);
        this.id_finally = optional;
        if (bl) {
            this.id_return = true;
        }
    }

    public void id_class(int n, int n2) {
        this.id_break(this.id_throws, n, n2);
    }

    public void id_class(int n) {
        this.id_public = n;
    }

    private void id_class(long l, boolean bl) {
        if (l == this.id_throws) {
            this.id_byte.id_class(bl);
        }
    }

    public void id_class(InputStream inputStream, InputStream inputStream2) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            if (inputStream == null) {
                throw new FileNotFoundException("icons/icon_16x16.png");
            }
            if (inputStream2 == null) {
                throw new FileNotFoundException("icons/icon_32x32.png");
            }
            IntBuffer intBuffer = memoryStack.mallocInt(1);
            IntBuffer intBuffer2 = memoryStack.mallocInt(1);
            IntBuffer intBuffer3 = memoryStack.mallocInt(1);
            GLFWImage.Buffer buffer = GLFWImage.mallocStack((int)2, (MemoryStack)memoryStack);
            ByteBuffer byteBuffer = this.id_class(inputStream, intBuffer, intBuffer2, intBuffer3);
            if (byteBuffer == null) {
                throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }
            buffer.position(0);
            buffer.width(intBuffer.get(0));
            buffer.height(intBuffer2.get(0));
            buffer.pixels(byteBuffer);
            ByteBuffer byteBuffer2 = this.id_class(inputStream2, intBuffer, intBuffer2, intBuffer3);
            if (byteBuffer2 == null) {
                throw new IllegalStateException("Could not load icon: " + STBImage.stbi_failure_reason());
            }
            buffer.position(1);
            buffer.width(intBuffer.get(0));
            buffer.height(intBuffer2.get(0));
            buffer.pixels(byteBuffer2);
            buffer.position(0);
            GLFW.glfwSetWindowIcon((long)this.id_throws, (GLFWImage.Buffer)buffer);
            STBImage.stbi_image_free((ByteBuffer)byteBuffer);
            STBImage.stbi_image_free((ByteBuffer)byteBuffer2);
        }
        catch (IOException iOException) {
            id_class.error("Couldn't set icon", (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ByteBuffer id_class(InputStream inputStream, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) throws IOException {
        ByteBuffer byteBuffer;
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        ByteBuffer byteBuffer2 = null;
        try {
            byteBuffer2 = fo_3.id_class(inputStream);
            ((Buffer)byteBuffer2).rewind();
            byteBuffer = STBImage.stbi_load_from_memory((ByteBuffer)byteBuffer2, (IntBuffer)intBuffer, (IntBuffer)intBuffer2, (IntBuffer)intBuffer3, (int)0);
        }
        finally {
            if (byteBuffer2 != null) {
                MemoryUtil.memFree((Buffer)byteBuffer2);
            }
        }
        return byteBuffer;
    }

    public static void id_class(BiConsumer<Integer, String> biConsumer) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            int n = GLFW.glfwGetError((PointerBuffer)pointerBuffer);
            if (n != 0) {
                long l = pointerBuffer.get();
                String string = l == 0L ? "" : MemoryUtil.memUTF8((long)l);
                biConsumer.accept(n, string);
            }
        }
    }

    public void id_class(double d) {
        this.id_else = d;
        int n = (int)((double)this.id_new / d);
        this.id_super = (double)this.id_new / d > (double)n ? n + 1 : n;
        int n2 = (int)((double)this.id_continue / d);
        this.id_this = (double)this.id_continue / d > (double)n2 ? n2 + 1 : n2;
    }

    public int id_class(int n, boolean bl) {
        int n2;
        for (n2 = 1; n2 != n && n2 < this.id_new && n2 < this.id_continue && this.id_new / (n2 + 1) >= 320 && this.id_continue / (n2 + 1) >= 240; ++n2) {
        }
        if (bl && n2 % 2 != 0) {
            ++n2;
        }
        return n2;
    }

    public int id_class() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return GLX._getRefreshRate(this);
    }

    public void id_class(int n, long l) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        String string = MemoryUtil.memUTF8((long)l);
        id_class.error("########## GL ERROR ##########");
        id_class.error("@ {}", (Object)this.id_synchronized);
        id_class.error("{}: {}", (Object)n, (Object)string);
    }

    public void id_class(boolean bl) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
        this.id_goto = bl;
        GLFW.glfwSwapInterval((int)(bl ? 1 : 0));
    }

    private void id_class(long l, int n, int n2) {
        this.id_volatile = n;
        this.id_final = n2;
    }

    public void id_class(String string) {
        this.id_synchronized = string;
        if (string.equals("Startup")) {
            rrzJ_2.id_protected();
        }
    }

    @Override
    public void close() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        this.id_while = true;
        Callbacks.glfwFreeCallbacks((long)this.id_throws);
        this.id_break.close();
        GLFW.glfwDestroyWindow((long)this.id_throws);
        GLFW.glfwTerminate();
    }

    public void id_break(String string) {
        GLFW.glfwSetWindowTitle((long)this.id_throws, (CharSequence)string);
    }

    public void id_break(boolean bl) {
        Ve_1.id_class(this.id_throws, bl);
    }

    public boolean id_break() {
        return GLX._shouldClose(this);
    }

    private static void id_break(int n, long l) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        String string = "GLFW error " + n + ": " + MemoryUtil.memUTF8((long)l);
        TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)(string + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        throw new QR(string);
    }

    private void id_break(long l, boolean bl) {
        if (bl) {
            this.id_byte.id_break();
        }
    }

    private void id_break(long l, int n, int n2) {
        if (l == this.id_throws) {
            int n3 = this.id_extends();
            int n4 = this.id_native();
            if (n != 0 && n2 != 0) {
                this.id_new = n;
                this.id_continue = n2;
                if (this.id_extends() != n3 || this.id_native() != n4) {
                    this.id_byte.v();
                }
            }
        }
    }

    public void id_throws() {
        RenderSystem.flipFrame(this.id_throws);
        if (this.id_extends != this.id_native) {
            this.id_native = this.id_extends;
            this.id_byte(this.id_goto);
        }
    }

    public boolean id_finally() {
        return this.id_extends;
    }

    public void id_catch() {
        if (this.id_extends && this.id_return) {
            this.id_return = false;
            this.id_instanceof();
            this.id_byte.v();
        }
    }

    public int id_extends() {
        return this.id_new;
    }

    public boolean id_goto() {
        return this.id_while;
    }

    public Optional<yM_2> id_case() {
        return this.id_finally;
    }

    public int id_continue() {
        return this.id_int;
    }

    public int id_else() {
        return this.id_volatile;
    }

    public long id_implements() {
        return this.id_throws;
    }

    private void id_instanceof() {
        boolean bl;
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        boolean bl2 = bl = GLFW.glfwGetWindowMonitor((long)this.id_throws) != 0L;
        if (this.id_extends) {
            Qa_1 qa_1 = this.id_protected.id_class(this);
            if (qa_1 == null) {
                id_class.warn("Failed to find suitable monitor for fullscreen mode");
                this.id_extends = false;
            } else {
                yM_2 yM_22 = qa_1.id_class(this.id_finally);
                if (!bl) {
                    this.id_case = this.id_volatile;
                    this.id_catch = this.id_final;
                    this.id_private = this.id_package;
                    this.id_implements = this.id_int;
                }
                this.id_volatile = 0;
                this.id_final = 0;
                this.id_package = yM_22.id_class();
                this.id_int = yM_22.id_break();
                GLFW.glfwSetWindowMonitor((long)this.id_throws, (long)qa_1.id_case(), (int)this.id_volatile, (int)this.id_final, (int)this.id_package, (int)this.id_int, (int)yM_22.id_case());
            }
        } else {
            this.id_volatile = this.id_case;
            this.id_final = this.id_catch;
            this.id_package = this.id_private;
            this.id_int = this.id_implements;
            GLFW.glfwSetWindowMonitor((long)this.id_throws, (long)0L, (int)this.id_volatile, (int)this.id_final, (int)this.id_package, (int)this.id_int, (int)-1);
        }
    }

    public int id_new() {
        return this.id_package;
    }

    public float id_package() {
        return (float)this.id_super() / 2.0f;
    }

    public double id_return() {
        return this.id_else;
    }

    public int id_super() {
        return this.id_super;
    }

    private void id_try() {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetFramebufferSize((long)this.id_throws, (int[])nArray, (int[])nArray2);
        this.id_new = nArray[0];
        this.id_continue = nArray2[0];
        if (this.id_continue == 0 || this.id_new == 0) {
            rrGY.INSTANCE.id_class((int n) -> {
                this.id_new = n;
            }, (int n) -> {
                this.id_continue = n;
            });
        }
    }

    private void id_while() {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        GLFW.glfwSetErrorCallback(Qg_1::id_break);
    }

    public Qa_1 id_public() {
        return this.id_protected.id_class(this);
    }

    public int id_protected() {
        return this.id_public;
    }

    public void id_private() {
        this.id_extends = !this.id_extends;
    }

    public float id_final() {
        return (float)this.id_continue / 2.0f;
    }

    public float id_volatile() {
        return (float)this.id_new / 2.0f;
    }

    public int id_synchronized() {
        return this.id_final;
    }

    public int id_native() {
        return this.id_continue;
    }
}

