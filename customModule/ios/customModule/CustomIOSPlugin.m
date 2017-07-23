#import "CustomIOSPlugin.h"
@implementation CustomIOSPlugin
RCT_EXPORT_MODULE()
- (NSDictionary *)constantsToExport {
    return @{@"sayHello": @"Hellow World From Native Code!"};
}
@end
