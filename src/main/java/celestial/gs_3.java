/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.Pointer
 */
package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.lwjgl.system.Pointer;

public class gs_3 {
    private static final MethodHandle id_class = GLX.make(() -> {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            Class<?> clazz = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
            Method method = clazz.getDeclaredMethod("untrack", Long.TYPE);
            method.setAccessible(true);
            Field field = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
            field.setAccessible(true);
            Object object = field.get(null);
            return clazz.isInstance(object) ? lookup.unreflect(method) : null;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    });

    public static void id_class(long l) {
        if (id_class != null) {
            try {
                id_class.invoke(l);
            }
            catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }
    }

    public static void id_class(Pointer pointer) {
        gs_3.id_class(pointer.address());
    }
}

