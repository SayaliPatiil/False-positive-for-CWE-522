public class DirectObjectReference1 {
@RequestMapping(value = "/records/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
@Timed
// EMB-ISSUE: CodeIssueNames.DIRECT_OBJECT_REFERENCE/no-detect

public ResponseEntity < Record > get(@PathVariable Long id) {
return log.debug("REST request to get record" + id);
}

}
